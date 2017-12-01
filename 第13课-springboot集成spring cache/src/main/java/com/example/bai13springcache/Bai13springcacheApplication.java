package com.example.bai13springcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Bai13springcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bai13springcacheApplication.class, args);
	}
}
