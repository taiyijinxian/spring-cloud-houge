package com.lofty.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer //激活对配置中心的支持
@SpringBootApplication
public class ConfigServerApplication {
   
	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
