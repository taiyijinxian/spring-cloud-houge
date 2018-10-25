package com.lofty.cloud.service.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.lofty.cloud.service.DynastyService;

@Component
public class DynastyServiceHystrix implements DynastyService{

	@Override
	public String hello(@RequestParam(value="name")String name) {
		return "hello," +name+", method invoke failed ";
	}

}
