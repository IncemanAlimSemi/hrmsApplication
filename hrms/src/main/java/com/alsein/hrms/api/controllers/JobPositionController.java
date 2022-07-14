package com.alsein.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alsein.hrms.business.abstracts.IJobPositionService;
import com.alsein.hrms.entities.concretes.JobPosition;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/jobposition")
@AllArgsConstructor
public class JobPositionController {
	IJobPositionService iJobPositionService;
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return iJobPositionService.getAll();
	}
}
