package com.mycom.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycom.member.model.service.MemberService;
import com.mycom.member.vo.Member;


public class TestMember {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mycom/common/config/spring-member.xml");
		MemberService service = (MemberService)ctx.getBean("memberServiceImpl");
		for(Member m:service.getMemberList()){
			System.out.println(m);
		}
	}
}
