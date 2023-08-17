package com.woo.shorts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.shorts.entity.Following;
import com.woo.shorts.entity.Member;
import com.woo.shorts.repository.FollowRepository;

@Service
public class FollowingService {
	
	@Autowired
	private FollowRepository repository;
	
	public void follow(Member receiver,Member sender) {
	
		Following following=Following.builder()
				.reciever(receiver)
				.sender(sender).build();
		
		repository.save(following);
		
	}
	
}
