package com.alsein.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alsein.hrms.business.abstracts.IEmployerService;
import com.alsein.hrms.dataAccess.abstracts.IEmployerDao;
import com.alsein.hrms.entities.concretes.Employer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Service
public class EmployerManager implements IEmployerService {
	
	IEmployerDao iEmployerDao;
	
	@Override
	public List<Employer> getAll() {
		return iEmployerDao.findAll();
	}
}
