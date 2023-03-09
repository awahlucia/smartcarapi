package com.lucy.smartcar.smartcar.controller;

import java.util.List;

import com.lucy.smartcar.smartcar.model.SmartCarUsers;
import com.lucy.smartcar.smartcar.service.SmartCarUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class UserController {
	
	@Autowired
	private SmartCarUserService service;
	
	@PostMapping("save")
	public ResponseEntity<String> saveUser(@RequestBody SmartCarUsers user){
		System.out.println(user.getUsername());
		service.saveUser(user);
		
		return new ResponseEntity<String>(user.getUsername()+" Registered!", HttpStatus.CREATED);
	}
	
	@GetMapping("users")
	public ResponseEntity<List<SmartCarUsers>> findAll(){
		
		
		return new ResponseEntity<List<SmartCarUsers>>(service.findAll(), HttpStatus.FOUND);
	}
	

	
}
