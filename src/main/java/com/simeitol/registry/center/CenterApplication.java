package com.simeitol.registry.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 启动注册中心
public class CenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(CenterApplication.class, args);
	}
}
