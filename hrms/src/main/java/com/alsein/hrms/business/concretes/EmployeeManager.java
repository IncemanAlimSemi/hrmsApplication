package com.alsein.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alsein.hrms.business.abstracts.IEmployeeService;
import com.alsein.hrms.dataAccess.abstracts.IEmployeeDao;
import com.alsein.hrms.entities.concretes.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Service
public class EmployeeManager implements IEmployeeService {
	
	private IEmployeeDao iEmployeeDao;
	
	@Override
	public List<Employee> getAll() {
		return iEmployeeDao.findAll();
	}
}
