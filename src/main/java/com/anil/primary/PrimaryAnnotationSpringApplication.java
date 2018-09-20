package com.anil.primary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.primary.controllers.PrimaryServiceController;

@SpringBootApplication
public class PrimaryAnnotationSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PrimaryAnnotationSpringApplication.class, args);
		PrimaryServiceController bean = run.getBean(PrimaryServiceController.class);
		System.out.println(bean.hello());
	}
}
