package com.mycom.member.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycom.common.util.PagingBean;
import com.mycom.member.vo.Member;

@Repository(value="memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSessionTemplate session;
	
	private String namespace="member.dao.memberMapper.";
	
	/**
	 * id로 회원 정보를 조회하여 return하는 메소드
	 * @param id 조회할 회원 ID
	 * @return 
	 */
	@Override
	public Member selectMemberById(String id){
		return session.selectOne(namespace+"selectMemberById");
	}
	/**
	 * 회원 정보를 DB에 insert하는 메소드
	 * @param member 등록할 회원 정보
	 */
	@Override
	public int insertMember(Member member){
		int cnt = session.insert(namespace+"insertMember",member);
		return cnt;
	}
	/**
	 * 회원 정보 수정 메소드
	 * 매개변수로 받은 Member객체의 id 회원의 나머지 정보를 변경한다. 단 ID와 가입일자는 변경 안한다.
	 * @param member
	 */
	@Override
	public int updateMember(Member member){
		int cnt = session.update(namespace+"updateMember",member);
		return  cnt;
	}
	/**
	 * 매개 변수로 받은 ID의 회원을 삭제하는 메소드
	 * @param id
	 */
	@Override
	public int deleteMemberById(String id){
		int cnt = session.delete(namespace+"deleteMemberById",id);
		return cnt;
	}
	/**
	 * Member 테이블의 전체 회원정보 조회 처리
	 * @return
	 */
	@Override
	public List<Member> selectAllMember(){
		return session.selectList(namespace+"selectAllMember");
	}
	/* ********************************************************
	 * 페이징
	 * ********************************************************/
	/**
	 * Member 테이블의 페이징 처리 전체 회원 조회 처리
	 * @param pageNo 조회할 페이지 번호
	 * @return
	 */
	@Override
	public List<Member> selectAllMemberPaging(int pageNo){
		Map param = new HashMap();
		param.put("contentsPerPage", PagingBean.CONTENTS_PER_PAGE);
		param.put("pageNo", pageNo);
		return session.selectList(namespace+"selectAllMember",param);
	}
	
	@Override
	public int selectTotalMemberCount(){

		int cnt = session.selectOne(namespace+"selectTotalMemberCount");
		return cnt;
	}
}











