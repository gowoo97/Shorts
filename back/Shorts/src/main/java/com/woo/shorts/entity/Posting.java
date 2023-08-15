package com.woo.shorts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Posting {
	
	@Id	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private long seq;
	
	@Column
	private String userId;
	
	@ManyToOne
	@JoinColumn(name = "image_seq")
	private Image image;
	
	@Column
	private String content;
	
}
