package com.alsein.hrms.business.abstracts;

import java.util.List;

import com.alsein.hrms.entities.concretes.JobPosition;

public interface IJobPositionService {
	List<JobPosition> getAll();

}
