package com.paulo.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.mongodb.domain.User;
import com.paulo.mongodb.repository.UserRepository;
import com.paulo.mongodb.service.exception.ObjectNotFoundException;

@Service
public class UserService
{
	@Autowired
	private UserRepository rep;

	public List<User> findAll()
	{
		return rep.findAll();
	}

	public User findById(String id)
	{
		Optional<User> user = rep.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}