package com.paulo.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.mongodb.domain.Post;
import com.paulo.mongodb.repository.PostRepository;
import com.paulo.mongodb.service.exception.ObjectNotFoundException;

@Service
public class PostService
{
	@Autowired
	private PostRepository rep;

	public Post findById(String id)
	{
		Optional<Post> post = rep.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public List<Post> findByTitle(String texto)
	{
		//return rep.findByTitleContainingIgnoreCase(texto);
		return rep.buscarTitulo(texto);
	}
}