package com.mycom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mycom.dao.MemberDAO;
import com.mycom.vo.Member;

//name은 자동으로 클래스명으로 되며. 바꾸고 싶으면 value를 따로 지정한다.
@Service(value="memberService")
public class MemberServiceImpl implements MemberService {
	
//	@Autowired // Spring container에 드록된 MemberDAO type의 bean 객체를 아래 변수에 주입.
//	@Qualifier("memberDAO") // 주입 받을 수 있는 bean이 여러개 일때 식별키를 지정. @Autowired와 같이 사용함.
	private MemberDAO memberDAO;
	
	@Autowired
	private MemberServiceImpl(@Qualifier("memberDAO")MemberDAO memberDAO){
		this.memberDAO = memberDAO;
	}
	
	@Override
	public Member getMemberById(String id){
		return memberDAO.selectMemberById(id);
	}
	@Override
	public void joinMember(Member member){
		memberDAO.insertMember(member);
	}
}
