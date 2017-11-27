package com.example.bai07txmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.bai07txmanager.dao")
public class Bai07txmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bai07txmanagerApplication.class, args);
	}
}
