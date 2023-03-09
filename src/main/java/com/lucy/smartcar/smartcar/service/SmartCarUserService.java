package com.lucy.smartcar.smartcar.service;

import java.util.List;

import com.lucy.smartcar.smartcar.model.SmartCarUsers;
import com.lucy.smartcar.smartcar.repository.SmartCarUserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SmartCarUserService {
	
	@Autowired
	private SmartCarUserRepo repo;
	
	public void saveUser(SmartCarUsers user) {
		repo.save(user);
	}
	
	public List<SmartCarUsers> findAll(){
		return repo.findAll();
	}

}
