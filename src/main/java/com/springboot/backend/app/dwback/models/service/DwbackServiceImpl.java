package com.springboot.backend.app.dwback.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.app.dwback.models.dao.DwbackDao;
import com.springboot.backend.app.dwback.models.entity.Dwback;

@Service
public class DwbackServiceImpl implements DwbackService {
	
	@Autowired
	private DwbackDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Dwback> findAll() {
		return (List<Dwback>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Dwback findById(Long id) {
		return dao.findById(id).orElse(null);
	}
	
	@Override
	public void deleteById(Long id) {
		dao.deleteById(id);
	}
	
	@Override
	public Dwback create(Dwback dwback) {
		return dao.save(dwback);
	}

}
