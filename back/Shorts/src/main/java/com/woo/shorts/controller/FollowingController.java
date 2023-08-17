package com.woo.shorts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woo.shorts.dto.MemberDTO;
import com.woo.shorts.entity.Member;
import com.woo.shorts.service.FollowingService;
import com.woo.shorts.service.MemberService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/following")
public class FollowingController {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private FollowingService followingService;
	
	@PostMapping("/{userId}")
	public void follow(@PathVariable("userId") String receiver,@RequestBody MemberDTO sender) {
		
		
		
		Member senderMember=memberService.getMemberByUserId(sender.getUserId());
		Member receiverMember=memberService.getMemberByUserId(receiver);
		
		System.out.println(senderMember);
		System.out.println(receiverMember);
		
		
		followingService.follow(receiverMember, senderMember);
		
		
	}
	
}
