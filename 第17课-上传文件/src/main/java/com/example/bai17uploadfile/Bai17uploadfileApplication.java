package com.example.bai17uploadfile;

import com.example.bai17uploadfile.storage.StorageProperties;
import com.example.bai17uploadfile.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(value = {StorageProperties.class})
public class Bai17uploadfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bai17uploadfileApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
