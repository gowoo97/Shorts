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

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Following {
	
	@Id	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private long seq;
	
	@ManyToOne
	@JoinColumn(name = "sender")
	private Member sender;
	
	@ManyToOne
	@JoinColumn(name = "reciever")
	private Member reciever;
	
}
