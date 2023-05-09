package com.dojo.AppService;



import java.util.List;

import org.springframework.stereotype.Service;

import com.dojo.models.Dojo;
import com.dojo.models.Ninja;
import com.dojo.repositories.DojoRepository;
import com.dojo.repositories.NinjaRepository;


@Service
public class AppService {
	  private final DojoRepository DojoRepository;
	  private final NinjaRepository NinjaRepository;
	    
	    public AppService(DojoRepository DojoRepository,NinjaRepository NinjaRepository) {
	        this.DojoRepository= DojoRepository;
	        this.NinjaRepository=NinjaRepository;
}
	 // creates a Dojo
	    public Dojo createDojo(Dojo x) {
	        return DojoRepository.save(x);
	    }
	    
	    public Ninja createNinja(Ninja s) {
	        return NinjaRepository.save(s);
	    }
	    public List<Dojo> findAllDojo(){
	    return DojoRepository.findAll();
}
	    public Dojo findDojo(Long id) {
	    	if(DojoRepository.findById(id).isPresent()) {
	        return DojoRepository.findById(id).get();}
	    	else {
	    		return null;
	    	}
	    }    
}