package com.chen.eureka.feignConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfig1 {
//    使用feign本身的注解，不是使用springMVC的注解 
//    @Bean
//    public Contract feignContract() {
//        return new feign.Contract.Default();
//    }

//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//        return new BasicAuthRequestInterceptor("user", "password");
//    }
	//自定义每个feignclient的日志级别
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
