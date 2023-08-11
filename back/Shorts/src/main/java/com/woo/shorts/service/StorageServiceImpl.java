package com.woo.shorts.service;

import java.io.IOException;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.woo.shorts.entity.Image;
import com.woo.shorts.repository.ImageRepository;

@Service
public class StorageServiceImpl implements StorageService {
	
	@Autowired
	private ImageRepository repository;

	@Override
	public void save(MultipartFile file) {
		try {
			file.transferTo(Paths.get("src/main/resources/static/img/"+file.getOriginalFilename()));
			Image image=Image.builder()
					.path("/img")
					.fileName(file.getOriginalFilename())
					.build();
			
			repository.save(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}

}
