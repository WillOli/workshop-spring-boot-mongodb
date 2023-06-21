package com.willoli.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import com.willoli.workshopmongo.services.excepction.ObjectFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willoli.workshopmongo.Repository.UserRepository;
import com.willoli.workshopmongo.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectFoundException("Objeto não encontrado"));

	}

}
