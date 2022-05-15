package com.james.dojosandninjas.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.dojosandninjas.models.Dojo;
import com.james.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;
	
	public List<Dojo> listDojos(){
		return this.dojoRepo.findAll();
	}
	
	public Dojo saveDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	
	public Dojo dojoDetails(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	
}
