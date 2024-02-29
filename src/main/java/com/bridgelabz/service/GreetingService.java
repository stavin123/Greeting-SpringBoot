package com.bridgelabz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.repository.GreetingRepository;

@Service
public class GreetingService {
	
	@Autowired
	private GreetingRepository repository;
	
	public Greeting saveGreeting(Greeting greeting) {
		return repository.save(greeting);
		
	}
	
	public Greeting getGreetingByID(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Greeting> getAllGreeting() {
		return repository.findAll();
	}
	
	public Greeting getByName(String name) {
		return repository.findByname(name);
		
	}
	
	  public void deleteGreetingByID(int id) {
	        repository.deleteById(id);
	    }
}
