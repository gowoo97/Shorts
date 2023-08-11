package com.woo.shorts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.woo.shorts.entity.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long> {

	
}
