package com.woo.shorts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.shorts.entity.Member;
import com.woo.shorts.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public Member enroll(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public void delete(Member member) {
		

	}

	@Override
	public void modify(Member pre, Member post) {
		

	}

	@Override
	public Member select(String memberId) {
		
		return null;
	}

}
