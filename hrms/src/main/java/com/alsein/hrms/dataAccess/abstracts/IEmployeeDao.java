package com.alsein.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alsein.hrms.entities.concretes.Employee;

public interface IEmployeeDao extends JpaRepository<Employee, Integer>  {

}
