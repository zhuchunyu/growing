package com.habage.growing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuz
 */
@SpringBootApplication
@MapperScan(basePackages = "com.habage.growing.mapper")
public class GrowingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrowingApplication.class, args);
	}
}
