package com.alsein.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alsein.hrms.entities.concretes.Employer;

public interface IEmployerDao extends JpaRepository<Employer, Integer>  {

}
