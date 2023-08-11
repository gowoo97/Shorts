package com.woo.shorts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Image {
	
	@Id	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private long seq;
	
	@Column
	private String path;
	
	@Column
	private String fileName;
	
	
}
