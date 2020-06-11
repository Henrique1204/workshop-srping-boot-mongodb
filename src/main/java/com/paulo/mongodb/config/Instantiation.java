package com.paulo.mongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.paulo.mongodb.domain.User;
import com.paulo.mongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner
{
	@Autowired
	private UserRepository userRepository;

	// Métodos da interface
	@Override
	public void run(String... args) throws Exception
	{
		userRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex =  new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");

		userRepository.saveAll(Arrays.asList(maria, alex, bob));
	}
}