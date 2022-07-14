package com.alsein.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alsein.hrms.business.abstracts.ISystemPersonalService;
import com.alsein.hrms.dataAccess.abstracts.ISystemPersonalDao;
import com.alsein.hrms.entities.concretes.SystemPersonal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Service
public class SystemPersonalManager implements ISystemPersonalService {

	private ISystemPersonalDao iSystemPersonalDao;
	
	@Override
	public List<SystemPersonal> getAll() {
		return iSystemPersonalDao.findAll();
	}

}
