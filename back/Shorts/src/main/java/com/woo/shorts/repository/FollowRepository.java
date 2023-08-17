package com.woo.shorts.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.woo.shorts.entity.Following;
import com.woo.shorts.entity.Member;

public interface FollowRepository extends CrudRepository<Following, Long> {

	List<Following> findBySender(Member sender);
	
}
