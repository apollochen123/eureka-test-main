
/**
 * Project Name:eureka-test-producer 
 * File Name:ProducerService.java <br/><br/>  
 * Description: TODO
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Dec 8, 2017 3:20:38 PM
 * @version 
 * @see
 * @since 
 */
package com.chen.eureka.producer.service;

import com.chen.eureka.producer.model.User;

/**
 * ClassName: ProducerService <br/>
 * <br/>
 * Description: TODO
 * 
 * @author SAP
 * @version
 * @see
 * @since
 */
public interface ProducerService
{

    String afterTest(String in);

    String beforeTest(User u,String in);

    User afterRunningTest(String in);
    
    String afterThrowingTest(String in) throws Exception;
    
    String aroundTest(String in);
}
