package com.woo.shorts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woo.shorts.entity.Member;
import com.woo.shorts.service.MemberService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/{str}")
	public List<Member> getMemberListByStr(@PathVariable("str") String str){
		return service.readMembersByStr(str);
	}
	
}
