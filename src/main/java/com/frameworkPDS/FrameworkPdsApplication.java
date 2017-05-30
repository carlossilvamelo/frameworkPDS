package com.frameworkPDS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.controller.testes.TesteController;


@SpringBootApplication
@ComponentScan(basePackageClasses={TesteController.class})
public class FrameworkPdsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FrameworkPdsApplication.class, args);
		
		
	}
}
