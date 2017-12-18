
  
 /**
  * Project Name:eureka-test-producer 
  * File Name:ProducerService.java <br/><br/>  
  * Description: TODO
  * Copyright: Copyright (c) 2017 
  * Company:SAP
  * 
  * @author SAP
  * @date Dec 8, 2017 3:18:49 PM
  * @version 
  * @see
  * @since 
  */
  package com.chen.eureka.producer.service;

import org.springframework.stereotype.Service;

import com.chen.eureka.producer.aspect.MyAnnotation;
import com.chen.eureka.producer.model.User;

/**
  * ClassName: ProducerService <br/><br/> 
  * Description: TODO
  * @author SAP
  * @version 
  * @see
  * @since 
  */
@Service
public class ProducerServiceImpl implements ProducerService
{

    
     /**
      * {@inheritDoc} 
      * @see com.chen.eureka.producer.service.ProducerService#afterTest(java.lang.String)
      */
    @Override
    public String afterTest(String in)
    {
         System.out.println("This is afterTest..."); 
         return "afterTest result";
    }

    
     /**
      * {@inheritDoc} 
      * @see com.chen.eureka.producer.service.ProducerService#beforeTest(com.chen.eureka.producer.model.User, java.lang.String)
      */
    @Override
    public String beforeTest(User u, String in)
    {
        System.out.println("This is beforeTest..."+u.getAddress()); 
        return "beforeTest result";
    }

    
     /**
      * {@inheritDoc} 
      * @see com.chen.eureka.producer.service.ProducerService#afterRunningTest(java.lang.String)
      */
    @Override
    @MyAnnotation
    public User afterRunningTest(String in)
    {
        System.out.println("This is afterRunningTest...");
        User user = new User();
        user.setId("id");
        System.out.println("This is orginal id:"+user.getId());
        return user;
    }

    
     /**
      * {@inheritDoc} 
     * @throws Exception 
      * @see com.chen.eureka.producer.service.ProducerService#afterThrowingTest(java.lang.String)
      */
    @Override
    public String afterThrowingTest(String in) throws Exception
    {
        System.out.println("This is afterThrowingTest...");
        System.out.println("I have throwed a Exception");
        throw new Exception("I have throwed a Exception");
    }

    
     /**
      * {@inheritDoc} 
      * @see com.chen.eureka.producer.service.ProducerService#aroundTest()
      */
    @Override
    @MyAnnotation
    public String aroundTest(String in)
    {
         System.out.println("This is aroundTest");
         return "aroundTest result";
    }

}
 