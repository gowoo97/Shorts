package com.woo.shorts.dto;

import com.woo.shorts.entity.Image;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
	
	private long seq;
	
	private String userId;
	
	private Image image;
	
	private String content;
	
}
