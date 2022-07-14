package com.alsein.hrms.business.abstracts;

import java.util.List;

import com.alsein.hrms.entities.concretes.Employee;

public interface IEmployeeService {
	List<Employee> getAll();
}
