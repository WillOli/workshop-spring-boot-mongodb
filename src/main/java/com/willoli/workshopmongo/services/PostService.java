package com.willoli.workshopmongo.services;
import com.willoli.workshopmongo.Repository.PostRepository;
import com.willoli.workshopmongo.domain.Post;
import com.willoli.workshopmongo.services.excepction.ObjectFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post>obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectFoundException("Objeto não encontrado"));
	}

	public List<Post> findByTitle(String text) {
		return repo.searchTititle(text);
	}

	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}


}
