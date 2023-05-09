package com.dojo.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dojo.AppService.AppService;
import com.dojo.models.Dojo;
import com.dojo.models.Ninja;

import jakarta.validation.Valid;



@Controller
public class Appcontroller {

	  private final AppService AppService;
	    
	    public Appcontroller(AppService AppService) {
	        this.AppService = AppService;
	    }
	    
	    
	
	    
	    //Method that rendering pages and create a object dojo 1
	    //Add Name
	    @RequestMapping("/Dojo/new")
	    public String index(@ModelAttribute("allDojo") Dojo Dojo) {
	        return "dojo.jsp";
	    }
	    
	    // to handel the form and use the same route in action in jsp 2
	    //to send to Data base // to gother always
	    @PostMapping("/Dojo/new")
	    public String index(@Valid @ModelAttribute("allDojo") Dojo Dojo,BindingResult result) {
	    	 if (result.hasErrors()) {
	             return "dojo.jsp";
	         } else {
	        	 AppService.createDojo(Dojo);
	             return "redirect:/";
	    }
}
//    //method to show all dojos 3
//	    //show the all add name not in the assiment
	    @RequestMapping("/")
	    public String index(Model model) {
	    	List<Dojo> Dojo =AppService.findAllDojo();
	    	model.addAttribute("allDojo",Dojo);
	        return "index.jsp";
	    }
	    
	    @RequestMapping("/ninja/new")
	    public String index1(@ModelAttribute("ninja") Ninja ninja,Model model) {
	    	List<Dojo> Dojo =AppService.findAllDojo();
	    	model.addAttribute("allDojo",Dojo);
	        return "ninja.jsp";
	    }
	    @PostMapping("/ninja/new")
	    public String index(@Valid @ModelAttribute("ninja") Ninja ninja,BindingResult result) {
	    	 if (result.hasErrors()) {
	             return "ninja.jsp";
	         } else {
	        	 AppService.createNinja(ninja);
	             return "redirect:/";
	    }
}
	    @GetMapping("/dojos/{id}")
	    public String show(@PathVariable("id")Long id,Model model) {
	    	Dojo dojo = AppService.findDojo(id);
	    	model.addAttribute("Dojo",dojo);
	    	List<Ninja> allNinja=dojo.getNinjas();
	    	model.addAttribute("allNinja",allNinja);
	    	return "table.jsp";
	

}
}
