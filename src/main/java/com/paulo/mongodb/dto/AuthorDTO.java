package com.paulo.mongodb.dto;

import java.io.Serializable;

import com.paulo.mongodb.domain.User;

public class AuthorDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;

	// Construtores
	public AuthorDTO() {}

	public AuthorDTO(User user)
	{
		this.setId(user.getId());
		this.setName(user.getName());
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

	// Setters
	public void setId(String id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
