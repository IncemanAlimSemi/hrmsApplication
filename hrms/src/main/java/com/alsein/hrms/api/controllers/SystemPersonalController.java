package com.alsein.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alsein.hrms.business.abstracts.ISystemPersonalService;
import com.alsein.hrms.entities.concretes.SystemPersonal;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/systempersonal")
@AllArgsConstructor
public class SystemPersonalController {
	
	ISystemPersonalService iSystemPersonalService;
	
	@GetMapping("/getall")
	public List<SystemPersonal> getAll(){
		return iSystemPersonalService.getAll();
	}
	
}
