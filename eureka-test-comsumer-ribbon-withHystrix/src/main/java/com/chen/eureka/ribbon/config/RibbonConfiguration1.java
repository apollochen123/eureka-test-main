package com.chen.eureka.ribbon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;

@Configuration
//此处的为ribbon的自定义配置，注意不要放在扫描包下
//通过重写RibbonClientConfiguration的方法，可以达到自定义配置的目的
public class RibbonConfiguration1 {
	@Autowired
	public IClientConfig iClientConfig;
	
	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new RandomRule();
	}

}
