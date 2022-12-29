package com.fronchak.DSLearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fronchak.DSLearn.dtos.user.UserOutputDTO;
import com.fronchak.DSLearn.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserOutputDTO> findById(@PathVariable Long id) {
		UserOutputDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
