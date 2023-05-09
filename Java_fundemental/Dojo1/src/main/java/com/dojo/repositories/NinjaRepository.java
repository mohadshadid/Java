package com.dojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.dojo.models.Ninja;



public interface NinjaRepository extends CrudRepository<Ninja, Long>{

	List<Ninja> findAll();
}
