package com.alsein.hrms.business.abstracts;

import java.util.List;

import com.alsein.hrms.entities.concretes.User;

public interface IUserService {
	List<User> getAll();
}
