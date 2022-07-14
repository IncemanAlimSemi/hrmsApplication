package com.alsein.hrms.business.abstracts;

import java.util.List;

import com.alsein.hrms.entities.concretes.SystemPersonal;

public interface ISystemPersonalService {
	List<SystemPersonal> getAll();
}
