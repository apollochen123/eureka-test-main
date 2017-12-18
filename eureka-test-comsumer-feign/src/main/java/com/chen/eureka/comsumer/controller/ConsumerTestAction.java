package com.chen.eureka.comsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chen.eureka.comsumer.feignInterface.GetUserInterface;
import com.chen.eureka.comsumer.model.User;

@RestController
public class ConsumerTestAction {
	@Autowired
	private GetUserInterface getUserInterface;
	@RequestMapping("/feignGetUser/{id}")
	public User ribbonGetUser(@PathVariable String id){
		System.out.println("正在使用feign调用producer");
		return getUserInterface.getUser(id);
	}
}
