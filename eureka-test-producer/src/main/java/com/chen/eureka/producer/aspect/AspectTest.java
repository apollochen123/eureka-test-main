
/**
 * Project Name:ems-srv-integration 
 * File Name:AspectTest.java <br/><br/>  
 * Description: TODO
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Dec 7, 2017 10:55:12 AM
 * @version 
 * @see
 * @since 
 */
package com.chen.eureka.producer.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.chen.eureka.producer.model.User;

/**
 * ClassName: AspectTest <br/>
 * <br/>
 * Description: TODO
 * 
 * @author SAP
 * @version
 * @see
 * @since
 */
@Aspect
@Component
@Repository
public class AspectTest
{
//    /**
//     * 配置pointCut的三种方式
//     */
//    //method 1：
//    @Pointcut("execution(public String com.chen.eureka.producer.service.ProducerServiceImpl.*(..))")
//    public void pointCut()
//    {
//    };
//
//    @Before("pointCut()")
//    @Order(2)
//    public void beforeAspect()
//    {
//        System.out.println("this is before Aspect 1 !");
//    }
//
//    //method 2:
//    @Before("execution(* com.chen.eureka.producer.service.ProducerService.*(..))")
//    @Order(3)
//    public void beforeAspect2()
//    {
//        System.out.println("this is before Aspect 2 !");
//    }
//
//    //method 3：
//
//    /**
//     * <aop:config>
//     * <aop:pointcut id="anyMethod" expression="@target(org.springframework.stereotype.Repository)" order="1"/>
//     * </aop:config>
//     */

    /**
     * pointCut 定义方式
     */
    //the frist String means return string ，the second String means the args is String.class
    @Pointcut("execution(String com.chen.eureka.producer.service.ProducerService.getTest(String))")
    public void executionPointCut()
    {
    }

    //第一个*代表所有返回值，第二个*代表ProducerService的所有方法，（..）代表不管什么参数
    @Pointcut("execution(* com.chen.eureka.producer.service.ProducerService.*2(..))")
    public void executionPointCut2()
    {
    }

    //代表ProducerService的所有方法
    @Pointcut("within(com.chen.eureka.producer.service.ProducerService)")
    public void withinPointCut()
    {
    }

    //代表com.chen.eureka.producer包和子包下的所有方法
    @Pointcut("within(com.chen.eureka.producer..*)")
    public void withinPointCut2()
    {
    }

    // Spring AOP will use the JDK-based proxy 实现ProducerService接口的所有方法
    @Pointcut("target(com.chen.eureka.producer.service.ProducerService)")
    public void targetPointCut()
    {
    }

    //ProducerServiceImpl如果没有实现任何的接口，可以使用this。
    @Pointcut("this(com.chen.eureka.producer.service.ProducerServiceImpl)")
    public void thisPointCut()
    {
    }

    //所有标注了@Service注解的类的方法
    @Pointcut("@target(org.springframework.stereotype.Service)")
    public void atargetPointCut()
    {
    }

    //持有@PathVariable注解的参数的方法
    @Pointcut("@args(com.chen.eureka.producer.aspect.ParamAnnotation, ..)")
    public void aargsPointCut()
    {
    }

    //持有@Service注解的class的方法，接口不起作用
    @Pointcut("@within(org.springframework.stereotype.Service)")
    public void awithinPointCut()
    {
    }

    //持有@MyAnnotation注解的方法
    @Pointcut("@annotation(com.chen.eureka.producer.aspect.MyAnnotation)")
    public void aannotationPointCut()
    {
    }

    @Before("@args(paramAnnotation, ..) && execution(* com.chen.eureka.producer.service.ProducerService.before*(..))")
    public void beforeAndAargsAspect(JoinPoint thisJoinPoint, ParamAnnotation paramAnnotation)
    {
        System.out.println("beforeAndAargsAspect："+paramAnnotation.toString());
    }
    
    @After("execution(* com.chen.eureka.producer.service.ProducerService.afterTest(..))")
    public void AfterAspect(){
        System.out.println("AfterAndAnotationAspect： clear resource");
    }
    
    //@AfterReturning(returning="rvt",pointcut="@annotation(com.chen.eureka.producer.aspect.MyAnnotation)")
    public void AfterReturningAndAnotationAspect(Object rvt){
        User u  = (User) rvt;
        System.out.println("AfterReturningAndAnotationAspect： 正在处理返回值·····:"+u.getId());
        u.setId("new Id");
        System.out.println("返回值被改变为:"+u.getId());
    }
    
    @AfterThrowing(throwing="ex",pointcut="@target(org.springframework.stereotype.Service) && within(com.chen.eureka.producer..*)")
    public void AfterThrowingAndAtarget(Throwable ex){
        System.out.println("AfterThrowingAndAtarget： 捕捉到异常·····"+ex);
        System.out.println("AfterThrowingAndAtarget 模拟异常处理");
    }
    
    @Around("@annotation(myAnnotation)")
    public Object AroundAndAannotation(ProceedingJoinPoint point, MyAnnotation myAnnotation){
        Object object = null;
        System.out.println("正在使用Around进行Before增强···");
        try
        {
            System.out.println("shortString"+point.toShortString());
            System.out.println("LongString:"+point.toLongString());
            System.out.println("第一个参数是："+point.getArgs()[0]);
            object = point.proceed();
            System.out.println("正在使用Around进行AfterReturning增强···");
            object = "增强型Object"+object;
        }
        catch (Throwable e)
        {
            System.out.println("正在使用Around进行AfterThrowing增强···");
             e.printStackTrace();  
        }finally{
            System.out.println("正在使用Around进行After增强···");
            System.out.println("资源正在释放······");
        }
        return object;
    }
}
