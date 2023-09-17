package com.springboot.backend.app.dwback.models.service;

import java.util.List;

import com.springboot.backend.app.dwback.models.entity.Dwback;

public interface DwbackService {
	
	public List<Dwback> findAll();
	
	public Dwback findById(Long id);

}
