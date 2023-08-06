package com.woo.shorts.service;

import com.woo.shorts.entity.Member;

public interface MemberService {
	
	//멤버 등록
	public Member enroll(Member member);
	
	//멤버 제거
	public void delete(Member member);
	
	//멤버 수정
	public void modify(Member pre,Member post);
	
	//멤버 가져오기
	public Member login(Member member);
}
