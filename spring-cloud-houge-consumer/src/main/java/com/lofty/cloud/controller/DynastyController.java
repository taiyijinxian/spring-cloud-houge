package com.lofty.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lofty.cloud.service.DynastyService;

@RestController
@RequestMapping("/dynasty")
public class DynastyController {
	
//	@Value("${env}")
//    private String env;
	
	@Autowired
	private DynastyService dynastyService;

	@RequestMapping("/hello")
	public String hello(String name) {
		String value = dynastyService.hello(name) + ":";
		return value;
	}
}
