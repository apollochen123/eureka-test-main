package com.chen.eureka.comsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

import com.chen.eureka.ribbon.config.RibbonConfiguration1;

@SpringBootApplication
@EnableEurekaClient
//代码配置ribbon
@RibbonClient(name = "eureka-test-producer" , configuration = RibbonConfiguration1.class)
//解决配置文件放在扫描包下的问题
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION , value = DoNotScan.class)})
public class EurekaTestConsumerAplication {
	
	@Bean
	@LoadBalanced//加入ribbon负载均衡
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args)	 {
		SpringApplication.run(EurekaTestConsumerAplication.class, args);
	}
}
