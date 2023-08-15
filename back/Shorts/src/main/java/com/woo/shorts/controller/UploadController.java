package com.woo.shorts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.woo.shorts.service.StorageService;

@RestController
@RequestMapping("/upload")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UploadController {

	@Autowired
	private StorageService storageService;
	
	@PostMapping
	public void upload(@RequestParam("test") MultipartFile test,
			@RequestParam("content") String content,
			@RequestParam("userId") String userId) {
		
		storageService.save(test,content,userId);
		
		
	}
}
