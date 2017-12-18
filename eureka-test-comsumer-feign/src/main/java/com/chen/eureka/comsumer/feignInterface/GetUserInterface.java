package com.chen.eureka.comsumer.feignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chen.eureka.comsumer.model.User;
import com.chen.eureka.feignConfig.FeignConfig1;
//可以自定义配置
@FeignClient(name = "eureka-test-producer" , configuration = FeignConfig1.class)
//@FeignClient("eureka-test-producer")
//@FeignClient(name  = "eureka-test-producer" , url = "")
public interface GetUserInterface {
	@RequestMapping(method = RequestMethod.GET, value = "/getUser/{id}")//只能使用@RequestMapping，不能GetMapping等
	User getUser(@PathVariable("id") String id);//必须加入@PathVariable("id")
}
