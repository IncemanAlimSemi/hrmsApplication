package com.alsein.hrms.business.abstracts;

import java.util.List;

import com.alsein.hrms.entities.concretes.Employer;

public interface IEmployerService {
	List<Employer> getAll();

}
