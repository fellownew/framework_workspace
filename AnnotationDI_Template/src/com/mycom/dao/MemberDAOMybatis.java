package com.mycom.dao;

import org.springframework.stereotype.Repository;

import com.mycom.vo.Member;

@Repository
public class MemberDAOMybatis implements MemberDAO {

	@Override
	public Member selectMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMember(Member member) {
		// TODO Auto-generated method stub

	}

}
