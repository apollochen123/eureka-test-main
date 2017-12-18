package com.chen.eureka.comsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerTestAction {
	@RequestMapping("/consumerTest")
	public String hello(){
		return "this is consumer";
	}
}
