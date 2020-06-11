package com.paulo.mongodb.dto;

import java.io.Serializable;

import com.paulo.mongodb.domain.User;

public class UserDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String email;

	// Construtores
	public UserDTO() {}

	public UserDTO(User user)
	{
		this.setId(user.getId());
		this.setName(user.getEmail());
		this.setEmail(user.getEmail());
	}

	// Getters
	public String getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}

	public String getEmail()
	{
		return this.email;
	}

	// Setters
	public void setId(String id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}