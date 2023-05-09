package com.codingdojo.Save_Travels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.Save_Travels.models.Travel;

@Repository
public interface TravelRepo extends CrudRepository <Travel, Long> {
	List<Travel> findAll();
	

}
