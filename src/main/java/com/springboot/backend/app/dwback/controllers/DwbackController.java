package com.springboot.backend.app.dwback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
