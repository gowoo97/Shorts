package com.woo.shorts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woo.shorts.dto.MemberDTO;
import com.woo.shorts.entity.Member;
import com.woo.shorts.service.MemberService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private MemberService memberService;
	
	@PostMapping
	public ResponseEntity<MemberDTO> register(@RequestBody Member member){
		
		try {
			memberService.enroll(member);
			MemberDTO memberDTO=MemberDTO.builder()
					.userId(member.getMemberId())
					.userNickname(member.getNickName())
					.build();
			return ResponseEntity.ok().body(memberDTO);
		}catch(Exception e) {	
			return new ResponseEntity<MemberDTO>(HttpStatus.BAD_REQUEST);
		}
	}
}
