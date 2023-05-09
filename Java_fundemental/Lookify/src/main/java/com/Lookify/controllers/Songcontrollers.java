package com.Lookify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Lookify.models.Song;
import com.Lookify.services.Songservices;

import jakarta.validation.Valid;
@Controller
public class Songcontrollers {

    private final Songservices Songservices;
    
    public Songcontrollers(Songservices Songservices) {
        this.Songservices = Songservices;
    }
    
    // to render the first page we use this method to bring data from data base
    @RequestMapping("/")
    public String index() {
    	return "index.jsp";
    }
    
 // to render the 2 page we use this method to bring data from data base
    @RequestMapping("/dashboard")
    public String dashboard(Model model) {
    	model.addAttribute("allSong",Songservices.allSonge() );
    	return "dashboard.jsp";
    }
    
    // we will send the data to the data base and render
    @GetMapping("/songs/new")
    public String newsongs(@ModelAttribute("allSong") Song song) {
        return "newsongs.jsp";
    }
    @PostMapping("/songs/new")
    public String postsong(@Valid @ModelAttribute("allSong") Song song,BindingResult result, Model model) {
    	 if (result.hasErrors()) {
    		 model.addAttribute("Song",Songservices.allSonge());
             return "newsongs.jsp";
         } else {
        	 Songservices.createSonge(song);
             return "redirect:/dashboard";
             }
    }
    
         // to viwe the song details
    	 @GetMapping("/song/{id}")
    	 public String newsongs(@PathVariable("id") long id, Model model) {
    	     model.addAttribute("allSong", Songservices.findSong(id));
    	     return "detail.jsp";
    	 }

    //Delete the song
    	 @RequestMapping(value="/song/{id}", method=RequestMethod.DELETE)
    	 public String destroy(@PathVariable("id") Long id) {
    		 Songservices.deletSongs(id);
    	     return "redirect:/";
    	 }
    	 
    	 //Edit
    	 @RequestMapping("/song/{id}/edit")
    	 public String edit(@PathVariable("id") Long id, Model model) {
    		 Song song = Songservices.findSong(id);
    	     model.addAttribute("allsong", song);
    	     return "edit.jsp";
    	 }
    	 @RequestMapping(value="/song/{id}/edit", method=RequestMethod.PUT)
    	 public String update(@Valid @ModelAttribute("allsong") Song song, BindingResult result, Model model) {
    	     if (result.hasErrors()) {
    	         model.addAttribute("allsong", song);
    	         return "edit.jsp";
    	     } else {
    	    	 Songservices.UpdateSongs(song);
    	         return "redirect:/dashboard";
    	     }
}
}

