package com.frameworkPDS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.controller.testes.TesteController;
import com.frameworkPDS.services.ServicoService;


@SpringBootApplication
@ComponentScan(basePackageClasses={TesteController.class, ServicoService.class})
public class FrameworkPdsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FrameworkPdsApplication.class, args);
		
		
	}
}
