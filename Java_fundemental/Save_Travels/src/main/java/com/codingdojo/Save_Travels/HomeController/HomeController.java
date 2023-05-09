package com.codingdojo.Save_Travels.HomeController;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.Burgar_tracker_1.models.Burger;
import com.codingdojo.Save_Travels.models.Travel;
import com.codingdojo.Save_Travels.services.TravelServices;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	private final TravelServices travelservices;
	public HomeController(TravelServices travelservices) {
		this.travelservices = travelservices;
	}
	
	@RequestMapping("/expenses")
	public String travels(@ModelAttribute("travel") Travel travel,Model model) {
		List<Travel> t=this.travelservices.allTravels();
		 model.addAttribute("ts",t);
		return "travel.jsp";
	}
	@PostMapping("/addtravel")
	public String handelform (@Valid @ModelAttribute("travel") Travel travel,BindingResult result,Model model) {
		List<Travel> t=this.travelservices.allTravels();
		 model.addAttribute("ts",t);
		if (result.hasErrors()) {
			return "travel.jsp";
		}
		else {
			
			travelservices.createTravel(travel);
            return "redirect:/expenses";

		
	}	
}
	@RequestMapping("/edit/{id}")
	public String editform(@PathVariable("id") Long id,Model model,@ModelAttribute("travels") Travel travels) {
		Travel onetravel=this.travelservices.findById(id);
		model.addAttribute("travels", onetravel);
		return "edit.jsp";
	}
	@PostMapping("edit/{id}")
	public String updateburger(@Valid @ModelAttribute("travels") Travel travels,BindingResult result,@PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			this.travelservices.updateTravel(travels);
			return "redirect:/expenses";
	}
	
}
	 

	@RequestMapping("/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		travelservices.deleteTravel(id);
        return "redirect:/expenses";
    }
	@RequestMapping("/show/{id}")
	public String show(@PathVariable("id") Long id,Model model) {
		Travel one_travel=this.travelservices.findById(id);
		model.addAttribute("travel_one", one_travel);
		return "show.jsp";
	}
}