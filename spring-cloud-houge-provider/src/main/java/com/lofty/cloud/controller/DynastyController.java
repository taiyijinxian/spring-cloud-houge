package com.lofty.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
@RequestMapping("/dynasty/**")
public class DynastyController {
	
	@Value("${env}")
    private String env;
	
	@Value("${server.port}")
	private String port;

	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		System.out.println("provider1");
		return "hello, " + name + ":" +env + ":" + port;
	}
}
