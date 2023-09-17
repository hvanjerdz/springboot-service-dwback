package com.springboot.backend.app.dwback.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.app.dwback.models.entity.Dwback;
import com.springboot.backend.app.dwback.models.service.DwbackService;

@RestController
public class DwbackController {
	
	@Autowired
	private DwbackService backService;
	
	@GetMapping("/list")
	public List<Dwback> list(){
		
		return backService.findAll();
	}
	
	@GetMapping("/dwback/{id}")
	public Dwback detail(@PathVariable Long id) {
		return backService.findById(id);
	}
	

	@DeleteMapping("/dwback/{id}")
	public ResponseEntity<?> removeById(@PathVariable Long id){
		backService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	@PostMapping()
	public ResponseEntity<Dwback> create(@RequestBody Long id, Dwback dwback) {

    Dwback createdCurrency = backService.create(dwback);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdCurrency);
    }
	
}
