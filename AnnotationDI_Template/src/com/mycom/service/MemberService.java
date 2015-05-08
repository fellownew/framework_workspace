package com.mycom.service;

import com.mycom.vo.Member;

public interface MemberService {

	public abstract Member getMemberById(String id);

	public abstract void joinMember(Member member);

}