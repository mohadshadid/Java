package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class md {
	@RequestMapping("/daikichi/travel/{var}")
	public String index(@PathVariable("var") String x) {
	return "'Congratulations! You will soon travel to "+ x;
	}
	
	@RequestMapping("/daikichi/lotto/{x}")
	  public String lotto(@PathVariable("x") int x){
	    if(x%2 == 0){
	      return "You will take a grand journey in the near future, but be weary of tempting offers";
	    }else{
	      return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	    }

	  }

	}
	

