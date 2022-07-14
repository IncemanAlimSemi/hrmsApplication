package com.alsein.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alsein.hrms.business.abstracts.IUserService;
import com.alsein.hrms.dataAccess.abstracts.IUserDao;
import com.alsein.hrms.entities.concretes.User;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Service
public class UserManager implements IUserService {

	private IUserDao iUserDao;
	
	@Override
	public List<User> getAll() {
		return iUserDao.findAll();
	}
	
}
