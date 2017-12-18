package com.chen.eureka.producer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class EurekaTestProducerAplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaTestProducerAplication.class, args);
	}
}
