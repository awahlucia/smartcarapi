package com.lucy.smartcar.smartcar.repository;

import java.util.List;

import com.lucy.smartcar.smartcar.model.SmartCarUsers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartCarUserRepo extends JpaRepository<SmartCarUsers, Integer> {
	

	List<SmartCarUsers> findAll();
}
