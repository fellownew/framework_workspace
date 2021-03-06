package pub.test;

import java.util.Date;
import java.util.List;

import pub.dao.BookDAO;
import pub.vo.Book;

public class TestBook {
	public static void main(String[] args) {
		BookDAO dao = BookDAO.getInstance();
		int cnt = 0;
		
//		System.out.println("---insert Book---");
//		cnt = dao.insertBook(new Book("9788996991342","미움받을용기", "기시미 이치로", 331,13000,new Date(114,10,25),2));	
//		System.out.println("insert 결과 : "+cnt);
		
//		System.out.println("---delete Publisher---");
//		cnt = dao.deleteBookByIsbn("ISBN-123456");
//		System.out.println("delete 결과 : "+cnt);
//
//		System.out.println("--update Publisher--");
//		cnt = dao.updateBook(new Book("ISBN-123456","유지보수 힘들게 코딩하는 방법","개발자",230,16000,new Date(),10,new Publisher()));
//		System.out.println("update 결과 : "+cnt);
		
//		System.out.println("--==select==--");
//		System.out.println("--selectAll--");
		List<Book> rList = dao.selectAllBook();
//		for(Book b:rList){
//			System.out.println(b);
//		}
		System.out.println("--selectBetweenDate");
		rList = dao.selectBookBetweenDate("20140101","20150101");
		for(Book b:rList){
			System.out.println(b);
		}			
		System.out.println("--selectByAuthor--");
		rList = dao.selectBookByAuthor("래리 킹");
		for(Book b:rList){
			System.out.println(b);
		}	
		System.out.println("--selectByISBN");
		rList = dao.selectBookByIsbn("9788954635738");
		for(Book b:rList){
			System.out.println(b);
		}	
		
	}
}
