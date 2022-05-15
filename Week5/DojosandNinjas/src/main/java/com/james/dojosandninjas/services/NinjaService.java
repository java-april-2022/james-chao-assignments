package com.james.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.james.dojosandninjas.models.Ninja;
import com.james.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public List<Ninja> listNinjas(){
		return ninjaRepo.findAll();
	}
	
	public Ninja addNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> result = ninjaRepo.findById(id);
		if (result.isPresent()) {
			return result.get();
		}
		else {
			return null;
		}
	}
	
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		Optional<Ninja> result = ninjaRepo.findById(id);
		if (result.isPresent()) {
			ninjaRepo.deleteById(id);
		}
	}
	
	
}
