package com.lofty.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lofty.cloud.service.hystrix.DynastyServiceHystrix;

@FeignClient(name= "spring-cloud-provider",fallback=DynastyServiceHystrix.class) //name:远程服务名，及spring.application.name配置的名称
public interface DynastyService {
	
	@RequestMapping(value="/dynasty/hello")
	public String hello(@RequestParam(value = "name")String name);
}
