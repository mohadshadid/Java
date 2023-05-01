package com.example.Display_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Display {
	@GetMapping("/")
	public String main() {
		return "index.jsp";
	}
	
	@GetMapping("/Date")
	public String First(Model model) {
		
		SimpleDateFormat x = new SimpleDateFormat("EEE,MMM,d,yyyy");
		
		Date date = new Date();
		model.addAttribute("Date", x.format(date));
		
		return "Date.jsp";
	}
	
	@GetMapping("/Time")
	public String socund(Model model) {
		
		
		SimpleDateFormat x = new SimpleDateFormat("h:mm a");
		
		Date date = new Date();
		model.addAttribute("Time", x.format(date));
		return "Time.jsp";
	}
}
