package com.woo.shorts.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woo.shorts.entity.Member;

@SpringBootTest
@RunWith(SpringRunner.class)
class MemberServiceImplTest {

	@Autowired
	private MemberService memberServiceImpl;
	
	@Test
	void testEnroll() {
		Member member=Member.builder()
						.memberId("userId")
						.memberPw("userPw")
						.nickName("nickname").build();
		
		Member saved=memberServiceImpl.enroll(member);
		
		assertEquals(member,saved);
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testModify() {
		fail("Not yet implemented");
	}

	@Test
	void testSelect() {
		fail("Not yet implemented");
	}

}
