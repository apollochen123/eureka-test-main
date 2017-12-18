
  
 /**
  * Project Name:eureka-test-producer 
  * File Name:MyAnnotation.java <br/><br/>  
  * Description: TODO
  * Copyright: Copyright (c) 2017 
  * Company:SAP
  * 
  * @author SAP
  * @date Dec 8, 2017 4:27:47 PM
  * @version 
  * @see
  * @since 
  */
  package com.chen.eureka.producer.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
  * ClassName: MyAnnotation <br/><br/> 
  * Description: TODO
  * @author SAP
  * @version 
  * @see
  * @since 
  */
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Retention(RetentionPolicy.RUNTIME)
  @Documented
public @interface MyAnnotation
{
    String value() default "default value is hahaha";
}
 