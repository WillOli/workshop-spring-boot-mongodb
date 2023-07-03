package com.willoli.workshopmongo.resources;

import com.willoli.workshopmongo.domain.Post;
import com.willoli.workshopmongo.resources.util.URL;
import com.willoli.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
/*Cominha do end point*/
@RequestMapping(value="/posts")
public class PostResource {
	
	@Autowired
	private PostService service;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value="/titlesearch", method=RequestMethod.GET)
        public ResponseEntity<List<Post>> findByTitle(@RequestParam(value="text", defaultValue = "") String text) {
            text = URL.decodeParam(text);
            List<Post> list = service.findByTitle(text);
            return ResponseEntity.ok().body(list);
        }
    }
