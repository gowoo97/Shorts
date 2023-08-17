package com.woo.shorts.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.woo.shorts.entity.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
	
	Member findByMemberId(String memberId);
	
	List<Member> findByMemberIdStartsWith(String str);
	
}
