package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}

	@RequestMapping("/Daikichi")
	public String index() {
		return "Welcome";
	}
	@RequestMapping("/Daikichi/today")
	public String method() {
		return " today you will find luck in all you work";
	}
	
	@RequestMapping("/Daikichi/tomorrow")
	public String save() {
		return " Tomorrow, an apportunity will arise, so br sure to be open to new ideas!";
	}
}
