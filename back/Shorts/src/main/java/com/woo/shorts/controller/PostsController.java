package com.woo.shorts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woo.shorts.entity.Posting;
import com.woo.shorts.service.PostsService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/posts")
public class PostsController {
	
	@Autowired
	private PostsService service;
	
	@GetMapping("/{loggedUser}")
	public List<Posting> getPost(@PathVariable("loggedUser") String user) {
		
		List<Posting> l=service.getPosts(user);
		System.out.println(l);
		return service.getPosts(user);
		
	}
	
}
