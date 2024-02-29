package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bridgelabz.model.Greeting;


public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
	Greeting findByname(String name);
}
