package com.alsein.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alsein.hrms.business.abstracts.IUserService;
import com.alsein.hrms.entities.concretes.User;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {
	
	IUserService iUserService;
	
	@GetMapping("/getall")
	public List<User> getAll(){
		return iUserService.getAll();
	}
	
}
