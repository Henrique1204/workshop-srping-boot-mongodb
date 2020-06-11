package com.paulo.mongodb.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Long timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;

	// Construtores
	public StandardError() {}

	public StandardError(Long timestamp, Integer status, String error, String message, String path)
	{
		this.setTimestamp(timestamp);
		this.setStatus(status);
		this.setError(error);
		this.setMessage(message);
		this.setPath(path);
	}

	// Getters
	public Long getTimestamp()
	{
		return this.timestamp;
	}

	public Integer getStatus()
	{
		return this.status;
	}

	public String getError()
	{
		return this.error;
	}

	public String getMessage()
	{
		return this.message;
	}

	public String getPath()
	{
		return this.path;
	}

	// Setters
	public void setTimestamp(Long timestamp)
	{
		this.timestamp = timestamp;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public void setError(String error)
	{
		this.error = error;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void setPath(String path)
	{
		this.path = path;
	}
}