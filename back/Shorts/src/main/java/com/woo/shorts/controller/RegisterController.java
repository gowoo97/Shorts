package com.woo.shorts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woo.shorts.entity.Member;
import com.woo.shorts.service.MemberService;

@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private MemberService memberService;
	
	@PostMapping
	public void register(@RequestBody Member member) {
		memberService.enroll(member);
	}
}
