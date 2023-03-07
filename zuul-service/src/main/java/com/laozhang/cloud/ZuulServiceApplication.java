package com.techprimers.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@EnableHystrixDashboard
@SpringBootApplication
public class ZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServiceApplication.class, args);
	}
}
