package com.woo.shorts.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.woo.shorts.entity.Posting;

public interface PostingRepository extends CrudRepository<Posting, Long> {

	List<Posting> findByUserId(String str);
	
	
}
