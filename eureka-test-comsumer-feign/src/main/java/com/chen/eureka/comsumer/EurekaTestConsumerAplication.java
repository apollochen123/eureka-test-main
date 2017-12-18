package com.chen.eureka.comsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION , value = DoNotScan.class)})
public class EurekaTestConsumerAplication {
	public static void main(String[] args)	 {
		SpringApplication.run(EurekaTestConsumerAplication.class, args);
	}
}
