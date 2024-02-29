package com.bridgelabz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.service.GreetingService;

@RestController
public class GreetingController {
	
	@Autowired
	private GreetingService service;
	
	@GetMapping("/home")
	public String home() {
		return "In home page";
		
	}
	
	@PostMapping("/addgreeting")
	public Greeting addGreeting(@RequestBody Greeting greeting) {
		return service.saveGreeting(greeting);
			
	}
	
	@GetMapping("/showgreeting")
	public List<Greeting> getAllGreeting() {
		return service.getAllGreeting();
	}
	
	@GetMapping("/showbyid/{id}")
	public Greeting getGreetingByID(@PathVariable int id) {
		return service.getGreetingByID(id);
	}
	
	@DeleteMapping("/deletegreeting/{id}")
	 public void deleteGreetingByID(@PathVariable int id) {
        service.deleteGreetingByID(id);
    } 
}
	


