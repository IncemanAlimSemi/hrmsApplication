package com.alsein.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alsein.hrms.business.abstracts.IEmployerService;
import com.alsein.hrms.entities.concretes.Employer;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employer")
@AllArgsConstructor
public class EmployerController {
	
	IEmployerService iEmployerService;
	
	@GetMapping("/getall")
	public List<Employer> getAll() {
		return iEmployerService.getAll();
	}

}
