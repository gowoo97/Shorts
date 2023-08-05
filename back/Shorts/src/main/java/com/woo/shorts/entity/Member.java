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
public class Member {

	@Id	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private long seq;
	
	@Column
	private String memberId;
	
	@Column
	private String memberPw;
	
	@Column
	private String nickName;
	
}
