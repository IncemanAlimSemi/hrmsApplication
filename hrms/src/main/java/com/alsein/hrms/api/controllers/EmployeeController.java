package com.alsein.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alsein.hrms.business.abstracts.IEmployeeService;
import com.alsein.hrms.entities.concretes.Employee;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {
	
	IEmployeeService iEmployeeService;
	
	@GetMapping("/getall")
	public List<Employee> getAll() {
		return iEmployeeService.getAll();
	}
	
}
