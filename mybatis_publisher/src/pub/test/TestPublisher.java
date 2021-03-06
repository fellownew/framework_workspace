package pub.test;

import java.util.List;

import pub.dao.PublisherDAO;
import pub.vo.Publisher;

public class TestPublisher {
	public static void main(String[] args) {
		PublisherDAO dao = PublisherDAO.getInstance();
		int cnt = 0;
		
//		System.out.println("---insert Publisher---");
//		cnt = dao.insertPublisher(new Publisher(0,"금성출판사","제주","064-3411-9455"));
//		System.out.println("insert 결과 : "+cnt);
		
//		System.out.println("---delete Publisher---");
//		cnt = dao.deletePublisherByNo(9);
//		System.out.println("delete 결과 : "+cnt);
		
//		System.out.println("--update Publisher--");
//		cnt = dao.updatePublisher(new Publisher(10,"수정출판사","경기","031-1313-1313"));
//		System.out.println("update 결과 : "+cnt);
		
		System.out.println("--== select ==--");
		System.out.println("--selectAll--");
		List<Publisher> rlist = dao.selectAllPublisher();
		for(Publisher p:rlist){
			System.out.println(p);
		}
		System.out.println("--selectByAddress--");
		rlist = dao.selectPublisherByAddress("서");
		for(Publisher p:rlist){
			System.out.println(p);
		}
		System.out.println("--selectByNo--");
		rlist = dao.selectPublisherByNo(2);
		for(Publisher p:rlist){
			System.out.println(p);
		}
	}
}
