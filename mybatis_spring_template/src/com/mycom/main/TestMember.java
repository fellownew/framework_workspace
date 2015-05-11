package com.mycom.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycom.member.model.service.MemberService;
import com.mycom.member.vo.Member;


public class TestMember {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mycom/common/config/spring-member.xml");
		MemberService service = (MemberService)ctx.getBean("memberServiceImpl");

		
		Member m1 = new Member("qwerty7","1111","김철수","qwerty@gmail.com");
		Member m2 = new Member("qwerty7","1111","김철수","qwerty@gmail.com");
		
		try {
			service.testTransaction(m1, m2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Member m:service.getMemberList()){
			System.out.println(m);
		}
	}
}
