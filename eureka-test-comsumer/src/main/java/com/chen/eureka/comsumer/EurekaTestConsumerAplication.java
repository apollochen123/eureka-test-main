package com.chen.eureka.comsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaTestConsumerAplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaTestConsumerAplication.class, args);
	}
}
