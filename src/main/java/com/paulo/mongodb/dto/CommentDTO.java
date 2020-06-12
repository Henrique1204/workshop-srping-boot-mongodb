package com.paulo.mongodb.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String text;
	private Date date;
	private AuthorDTO author;

	// Construtores
	public CommentDTO() {}

	public CommentDTO(String text, Date date, AuthorDTO author)
	{
		this.setText(text);
		this.setDate(date);
		this.setAuthor(author);
	}

	// Getters
	public String getText()
	{
		return this.text;
	}

	public Date getDate()
	{
		return this.date;
	}

	public AuthorDTO getAuthor()
	{
		return this.author;
	}

	// Setters
	public void setText(String text)
	{
		this.text = text;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setAuthor(AuthorDTO author)
	{
		this.author = author;
	}
}