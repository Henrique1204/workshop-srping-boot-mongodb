package com.paulo.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.mongodb.domain.User;
import com.paulo.mongodb.repository.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository rep;

	public List<User> findAll()
	{
		return rep.findAll();
	}
}