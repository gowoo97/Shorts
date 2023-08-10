package com.woo.shorts.service;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {

	public void save(MultipartFile file);
	
}
