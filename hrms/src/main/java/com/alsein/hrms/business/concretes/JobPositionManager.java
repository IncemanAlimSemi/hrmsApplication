package com.alsein.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alsein.hrms.business.abstracts.IJobPositionService;
import com.alsein.hrms.dataAccess.abstracts.IJobPositionDao;
import com.alsein.hrms.entities.concretes.JobPosition;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Service
public class JobPositionManager implements IJobPositionService {
	
	private IJobPositionDao iJobPositionDao;
	
	@Override
	public List<JobPosition> getAll() {
		return iJobPositionDao.findAll();
	}

}
