package com.paulo.mongodb.service.exception;

public class ObjectNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	// Contrutor
	public ObjectNotFoundException(String msg)
	{
		super(msg);
	}
}