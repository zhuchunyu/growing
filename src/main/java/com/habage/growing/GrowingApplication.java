package com.habage.growing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

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
