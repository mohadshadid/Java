package com.codingdojo.Save_Travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.codingdojo.Save_Travels.models.Travel;
import com.codingdojo.Save_Travels.repositories.TravelRepo;

@Service
public class TravelServices {
	private final TravelRepo travelrepo;
	public TravelServices(TravelRepo travelrepo) {
        this.travelrepo = travelrepo;
    }
	 
	 public Travel createTravel(Travel t) {
	        return travelrepo.save(t);
	    }
	 public List<Travel> allTravels() {
	        return travelrepo.findAll();
	    }
	 
	 public Travel findById(long id) {
			Optional <Travel> tid= travelrepo.findById(id);
			if(tid.isPresent()) {
	            return tid.get();
		}
			else {
	            return null;
	        }
			
	}
	 
	 public Travel updateTravel(Travel v) {
			return travelrepo.save(v);
		}
	 public void deleteTravel(long id) {
		 travelrepo.deleteById(id);
	   }
}
