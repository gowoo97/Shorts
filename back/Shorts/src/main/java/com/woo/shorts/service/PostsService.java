package com.woo.shorts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.shorts.entity.Posting;
import com.woo.shorts.repository.PostingRepository;

@Service
public class PostsService {

	@Autowired
	private PostingRepository repository;
	
	
	public List<Posting> getPosts(){
		return repository.findTop10ByOrderBySeqDesc();
	}
	
}
