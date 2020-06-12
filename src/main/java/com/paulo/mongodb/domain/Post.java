package com.paulo.mongodb.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Date date;
	private String title;
	private String body;
	private User author;

	// Construtores
	public Post() {}

	public Post(String id, Date date, String title, String body, User author)
	{
		this.setId(id);
		this.setDate(date);
		this.setTitle(title);
		this.setBody(body);
		this.setAuthor(author);
	}

	// Getters
	public String getId()
	{
		return this.id;
	}

	public Date getDate()
	{
		return this.date;
	}

	public String getTitle()
	{
		return this.title;
	}

	public String getBody()
	{
		return this.body;
	}

	public User getAuthor()
	{
		return this.author;
	}

	// Setters
	public void setId(String id)
	{
		this.id = id;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setBody(String body)
	{
		this.body = body;
	}

	public void setAuthor(User author)
	{
		this.author = author;
	}

	// HashCode e Equals
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Post other = (Post) obj;

		if (id == null)
		{
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;

		return true;
	}
}