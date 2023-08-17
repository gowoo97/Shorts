package com.woo.shorts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.shorts.entity.Following;
import com.woo.shorts.entity.Member;
import com.woo.shorts.entity.Posting;
import com.woo.shorts.repository.FollowRepository;
import com.woo.shorts.repository.MemberRepository;
import com.woo.shorts.repository.PostingRepository;

@Service
public class PostsService {

	@Autowired
	private PostingRepository postingRepository;
	
	@Autowired
	private FollowRepository followRepository; 
	
	@Autowired
	private MemberRepository memberRepository;
	
	public List<Posting> getPosts(String user){
		
		//유저 멤버 객체
		Member m=memberRepository.findByMemberId(user);
		
		//sender가 user인 following list
		List<Following> list =followRepository.findBySender(m);
	
		//following의 receiver의 userId로 포스팅 찾기 
		ArrayList<Posting> al=new ArrayList<>();
		
		for(Following follow:list) {
			String receiver = follow.getReciever().getMemberId();
			al.addAll(postingRepository.findByUserId(receiver));
		}
		al.addAll(postingRepository.findByUserId(m.getMemberId()));
		
		return al;
	}
	
}
