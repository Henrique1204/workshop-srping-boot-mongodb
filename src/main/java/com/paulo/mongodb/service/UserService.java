package com.paulo.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.mongodb.domain.User;
import com.paulo.mongodb.dto.UserDTO;
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

	public User insert(User obj)
	{
		return rep.insert(obj);
	}

	public void delete(String id)
	{
		this.findById(id);
		rep.deleteById(id);
	}

	public User update(User att)
	{
		User user = findById(att.getId());

		updateData(user, att);
		return rep.save(user);
	}

	private void updateData(User user, User att)
	{
		user.setName(att.getName());
		user.setEmail(att.getEmail());
	}

	public User fromDTO(UserDTO objDTO)
	{
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
}