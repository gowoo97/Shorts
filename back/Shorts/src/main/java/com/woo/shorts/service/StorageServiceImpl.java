package com.woo.shorts.service;

import java.io.IOException;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.woo.shorts.entity.Image;
import com.woo.shorts.entity.Posting;
import com.woo.shorts.repository.ImageRepository;
import com.woo.shorts.repository.PostingRepository;

@Service
public class StorageServiceImpl implements StorageService {
	
	@Autowired
	private ImageRepository imageRepository;
	
	@Autowired
	private PostingRepository postingRepository; 

	@Override
	public void save(MultipartFile file,String content,String userId) {
		try {
			file.transferTo(Paths.get("src/main/resources/static/img/"+file.getOriginalFilename()));
			Image image=Image.builder()
					.path("/img")
					.fileName(file.getOriginalFilename())
					.build();
			
			imageRepository.save(image);
			
			Posting posting = Posting.builder().image(image).content(content)
					.userId(userId).build();
			
			postingRepository.save(posting);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}

}
