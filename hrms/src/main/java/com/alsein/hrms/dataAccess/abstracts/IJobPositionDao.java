package com.alsein.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alsein.hrms.entities.concretes.JobPosition;

public interface IJobPositionDao extends JpaRepository<JobPosition, Integer>  {

}
