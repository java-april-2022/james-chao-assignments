package com.james.dojosandninjas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.james.dojosandninjas.models.Dojo;
import com.james.dojosandninjas.models.Ninja;


public interface NinjaRepository extends CrudRepository<Ninja, Long> {
// this method retrieves all the ninjas from the database
    List<Ninja> findAll();
    
	List<Ninja> findAllByDojo(Dojo dojo);
	

}