package com.paulo.mongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.mongodb.domain.Post;
import com.paulo.mongodb.resources.util.URL;
import com.paulo.mongodb.service.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource
{
	@Autowired
	private PostService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id)
	{
		Post post = service.findById(id);
		return ResponseEntity.ok().body(post);
	}

	@RequestMapping(value = "/buscartitulo", method = RequestMethod.GET)
	public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "texto", defaultValue = "") String texto)
	{
		texto = URL.decodeParam(texto);
		List<Post> lista = service.findByTitle(texto);
		return ResponseEntity.ok().body(lista);
	}
}