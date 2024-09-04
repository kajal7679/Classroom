package com.tka.SpringbootFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringbootFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstProjectApplication.class, args);
	}
      
	@Bean
	@Scope("prototype")
	@Primary
	X createObjX(){
		X xx=new X(); 
		return xx;
	}
}
