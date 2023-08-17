package com.woo.shorts.service;

import java.util.List;

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
	
	public List<Member> readMembersByStr(String str){
		return memberRepository.findByMemberIdStartsWith(str);
	}

	@Override
	public Member login(Member member) {
		Member found=memberRepository.findByMemberId(member.getMemberId());
		if(member.getMemberId().equals(found.getMemberId()) && 
				member.getMemberPw().equals(found.getMemberPw())) {
				return found;
		}
		else return null;
	}

	@Override
	public Member getMemberByUserId(String str) {
		
		return memberRepository.findByMemberId(str);
	}

}
