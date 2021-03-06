package member.model.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import member.vo.Member;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import common.util.DatabaseUtil;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	private SqlSessionFactory factory;
	private String ns = "manager.member.";
	private MemberDAO(){
		factory = DatabaseUtil.getInstance().getSqlSessionFactory();
	}
	public static MemberDAO getInstance(){
		return instance;
	}
	/**
	 * id로 회원 정보를 조회하여 return하는 메소드
	 * @param id 조회할 회원 ID
	 * @return 
	 * @throws SQLException
	 */
	public List<Member> selectMemberById(String id) throws SQLException{
		SqlSession session = factory.openSession(true);
		try {
			return session.selectList(ns+"selectMemberById",id);
		} finally {
			session.close();
		}
	}
	/**
	 * 회원 정보를 DB에 insert하는 메소드
	 * @param member 등록할 회원 정보
	 * @throws SQLException
	 */
	public int insertMember(Member member) throws SQLException{
		SqlSession session = factory.openSession(true);
		try {
			int cnt = session.insert(ns+"insertMember",member);
			session.commit();
			System.out.println("insert된 맴버"+member);
			return cnt;
		} finally {
			session.close();
		}
	}
	/**
	 * Member 테이블의 전체 회원정보 조회 처리
	 * @return
	 * @throws SQLException
	 */
	public List<Member> selectAllMember() throws SQLException{
		SqlSession session = factory.openSession(true);
		try {
			return session.selectList(ns+"selectAllMember");
		} finally {
			session.close();
		}
	}
	
	/**
	 * 회원 정보 수정 메소드
	 * 매개변수로 받은 Member객체의 id 회원의 나머지 정보를 변경한다. 단 ID와 가입일자는 변경 안한다.
	 * @param member
	 * @throws SQLException
	 */
	public int updateMember(Member member) throws SQLException{
		SqlSession session = factory.openSession(true);
		try {
			int cnt = session.update(ns+"updateMember",member);
			session.commit();
			return cnt;
		} finally {
			session.close();
		}
	}
	/**
	 * 매개 변수로 받은 ID의 회원을 삭제하는 메소드
	 * @param id
	 * @throws SQLException
	 */
	public int deleteMemberById(String id) throws SQLException{
		SqlSession session = factory.openSession(true);
		try {
			int cnt = session.delete(ns+"deleteMemberById",id);
			session.commit();
			return cnt;
		} finally {
			session.close();
		}
	}
	
	public List<Member> selectAllMemberPaging(Map<String,Integer> map) throws SQLException{
		SqlSession session = factory.openSession(true);
		try {
			return session.selectList(ns+"selectAllMemberPaging",map);
		} finally {
			session.close();
		}
	}
	
	public int selectTotalMemberCount() throws SQLException{
		SqlSession session = factory.openSession(true);
		try {
			return session.selectOne(ns+"selectTotalMemberCount");
		} finally {
			session.close();
		}
	}
}











