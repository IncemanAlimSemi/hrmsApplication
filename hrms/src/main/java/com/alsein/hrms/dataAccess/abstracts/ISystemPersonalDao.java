package com.alsein.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alsein.hrms.entities.concretes.SystemPersonal;

public interface ISystemPersonalDao extends JpaRepository<SystemPersonal, Integer> {

}
