package com.alsein.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alsein.hrms.entities.concretes.User;

public interface IUserDao extends JpaRepository<User, Integer> {

}
