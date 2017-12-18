
  
 /**
  * Project Name:eureka-test-producer 
  * File Name:ParamAnnotation.java <br/><br/>  
  * Description: TODO
  * Copyright: Copyright (c) 2017 
  * Company:SAP
  * 
  * @author SAP
  * @date Dec 8, 2017 4:52:02 PM
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
  * ClassName: ParamAnnotation <br/><br/> 
  * Description: TODO
  * @author SAP
  * @version 
  * @see
  * @since 
  */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParamAnnotation
{
}
 