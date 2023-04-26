package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class HelloHumanApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}


@RequestMapping("/")
public String hello(@RequestParam(value="q",required=false) String x,@RequestParam(value="q1",required=false) String y) {
	if (x==null && y==null) {
		return "Hello Human";
	}
	else if(y==null) {
		return "Hello : " + x ;
	}else if(x==null) {
		return "Hello : " + y;
	}
	else {
	return "Hello : " + x +" "+y ;
	}
}
}
