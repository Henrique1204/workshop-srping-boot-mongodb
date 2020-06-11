package com.paulo.mongodb.resources;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.mongodb.domain.User;
import com.paulo.mongodb.dto.UserDTO;
import com.paulo.mongodb.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource
{
	@Autowired
	private UserService service;

	// @GetMapping -- tbm pode ser feito assim
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll()
	{
		List<User> lista = service.findAll();
		List<UserDTO> listaDTO = lista.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());

		return ResponseEntity.ok().body(listaDTO);
	}
}