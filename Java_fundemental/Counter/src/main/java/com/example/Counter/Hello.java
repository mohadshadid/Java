package com.example.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller

public class Hello {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String page(HttpSession session) {
		
		//get = to display the amount
		// set = to set the current value 
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			}
			else { int x = (int)session.getAttribute("count");
			x++;
			session.setAttribute("count", x);
			}
		return "counter.jsp";
	}

}
