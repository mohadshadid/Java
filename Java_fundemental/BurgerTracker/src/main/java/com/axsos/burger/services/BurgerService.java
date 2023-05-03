package com.axsos.burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.axsos.burger.models.Burger;
import com.axsos.burger.repositories.BurgerRepository;



@Service
public class BurgerService {
	private final BurgerRepository burgerRepository;
	
	public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }
	
	public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
    // creates a book
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    // retrieves a book
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
	public void deleteBurger(Long id) {
		// TODO Auto-generated method stub
		 burgerRepository.deleteById(id);
		
	}
	public Burger updateBurger(Burger b) {
		// TODO Auto-generated method stub
		burgerRepository.save(b);
		return b;

	}
	
}
