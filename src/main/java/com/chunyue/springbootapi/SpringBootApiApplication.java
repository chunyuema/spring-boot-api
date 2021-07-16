package com.chunyue.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "Hello World";
//	}

	@GetMapping
	public List<String> hello(){
		return List.of("Hello", "World");
	}

}