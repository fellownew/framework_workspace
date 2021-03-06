package member.model.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import member.exception.DuplicatedIdException;
import member.model.dao.MemberDAO;
import member.vo.Member;
import common.util.PagingBean;


/**
 * 회원 관리 Business Logic을 처리하는 Business Service 클래스
 * @author kgmyh
 *
 */
public class MemberService {
	private static MemberService instance = new MemberService();
	
	private MemberDAO dao;
//	private DatabaseUtil dbUtil;
	private MemberService(){
		dao = MemberDAO.getInstance();
//		dbUtil = DatabaseUtil.getInstance();
	}
	public static MemberService getInstance(){
		return instance;
	}
	/**
	 * 가입 처리 메소드
	 * @param member 가입 정보
	 * @throws SQLException
	 * @throws DuplicatedIdException 중복된 아이디일 경우 발생
	 */
	public void joinMember(Member member) throws SQLException,DuplicatedIdException{
//		Connection conn = dbUtil.getConnection();
//		//1. 등록된 ID가 있는 지 체크
//		//    - 이미 등록된 ID라면 DuplicatedIdException를 발생 시킨다.
//		if(dao.selectMemberById(conn, member.getId())!=null){
//			throw new DuplicatedIdException(member.getId()+"는 이미 등록된 아이디입니다. ID를 변경하세요");
//		}
//		//2. 디비에 회원정보 등록 처리
//		dao.insertMember(conn, member);
//		
//		//3. connection close
//		dbUtil.close(conn);
		System.out.println("--joinMember--");
		int cnt = dao.insertMember(member);
		System.out.println("joinMember : "+cnt);
	}
	/**
	 * 전체 회원 목록 조회 처리
	 * @return ArrayList
	 * @throws SQLException
	 */
	public List<Member> getMemberList() throws SQLException{
//		Connection conn = dbUtil.getConnection();
//		ArrayList<Member> list = dao.selectAllMember(conn);
//		dbUtil.close(conn);
//		return list;
		System.out.println("--MemberList--");
		List<Member> rlist = dao.selectAllMember();
		for(Member m:rlist){
			System.out.println(m);
		}
		return rlist;
	}
	/**
	 * ID로 회원 조회 메소드
	 * @param id : 조회할 회원 ID
	 * @return
	 * @throws SQLException
	 */
	public Member getMemberById(String id) throws SQLException{
//		Connection conn = dbUtil.getConnection();
//		Member member = dao.selectMemberById(conn, id);
//		dbUtil.close(conn);
//		return member;
		System.out.println("--selectMember--");
		List<Member> rlist = dao.selectMemberById(id);
		Member m = rlist.get(0);
		System.out.println(m);
		return m;
	}
	/**
	 * 회원 정보 수정 처리 메소드
	 * @param member 수정할 회원 전보
	 * @throws SQLException
	 */
	public void modifyMember(Member member) throws SQLException{
//		Connection conn = dbUtil.getConnection();
//		dao.updateMember(conn, member);
//		dbUtil.close(conn);
		System.out.println("--update member--");
		int cnt = dao.updateMember(member);
		System.out.println("update : "+cnt);
		
	}
	/**
	 * 회원 탈퇴 메소드
	 * @param id 탈퇴할 회원 ID
	 * @throws SQLException
	 */
	public void removeMemberById(String id) throws SQLException {
//		Connection conn = dbUtil.getConnection();
//		dao.deleteMemberById(conn, id);
//		dbUtil.close(conn);
		System.out.println("--delete member--");
		int cnt = dao.deleteMemberById(id);
		System.out.println("del member :"+cnt);
	}
	
	public Map<String,Object> getMemberListPaging(int pageNo) throws SQLException{
		//전체 데이터 개수 리턴.
		int memberCount = dao.selectTotalMemberCount();
		//페이징을 위한 객체 생성.
		PagingBean pb = new PagingBean(memberCount, pageNo);
		//페이지에 표시될 데이터 수와 현재 페이지 지정.
		Map<String,Integer> pageMap = new HashMap<>();
		pageMap.put("perPage", pb.CONTENTS_PER_PAGE);
		pageMap.put("page", pb.getCurrentPage());
		//해당 페이지에 있는 데이터 가져오기.
		List<Member> rList = dao.selectAllMemberPaging(pageMap);
		
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("memberList", rList);
		map.put("startPage", pb.getStartPageOfPageGroup());
		map.put("endPage", pb.getEndPageOfPageGroup());
		map.put("page",pb.getCurrentPage());
		map.put("preGroup", pb.isPreviousPageGroup());
		map.put("nextGroup",pb.isNextPageGroup());
		return map;
	}
	
}



