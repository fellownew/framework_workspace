package com.mycom.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mycom.vo.Member;
//xml에 따로 소스를 쓰는것이 아닌 bean으로 등록하라고 알려주는 어노테이션
@Repository(value="memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired // Spring container에 드록된 MemberDAO type의 bean 객체를 아래 변수에 주입.
	private MemberDAO memberDAO;
	
	@Override
	public Member selectMemberById(String id){
		int k = (int)(Math.random()*9)+1;
		return new Member(id, "이순신"+k, 20+k);
	}
	@Override
	public void insertMember(Member member){
		System.out.println("회원 등록 : "+member);
	}
}
