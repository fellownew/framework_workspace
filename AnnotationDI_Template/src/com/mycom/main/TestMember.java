package com.mycom.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycom.dao.MemberDAO;
import com.mycom.service.MemberService;
import com.mycom.vo.Member;


public class TestMember {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mycom/config/spring.xml");
		MemberService service = (MemberService)ctx.getBean("memberService");
		MemberDAO dao = (MemberDAO)ctx.getBean("memberDAO");
		Member m = service.getMemberById("id-1");
		System.out.println(m);
		
	}
}
