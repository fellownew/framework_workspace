package bookstore.client;

import java.util.List;

import bookstore.dao.PublisherDAO;
import bookstore.vo.Book;
import bookstore.vo.Publisher;

public class TestPublisher {
	public static void main(String[] args) {
		PublisherDAO dao = PublisherDAO.getInstance();
		int num = (int)(Math.random()*1000+1);
		int num2 = num%2;
//		Publisher insertPublisher = new Publisher(0, "우리출판사-"+num, num2==0?"서울시":"경기도", "010-"+num+"-1212");
//		
//		dao.insertPublisher(insertPublisher);
//		
//		Publisher updatePublisher = new Publisher(8, "변경된출판사명-"+num, "변경된주소 : "+num, "010-111-222"+num2);
//		dao.updatePublisher(updatePublisher);
//		
//		dao.deletePbulisherByPublisherNo(11);
//		
		List<Publisher> list = null;
		Publisher publisher = null;
		System.out.println("--------------전체 출판사 조회--------------------");
		list = dao.selectAllPublishers();
		for(Publisher p : list){
			System.out.println(p);
		}
		String address = "서울";
		System.out.printf("---------------출판사 주소로 조회: %s-----------%n", address);
		list = dao.selectPublisherByAddress(address);
		for(Publisher p : list){
			System.out.println(p);
		}
		int publisherNo = 2;
		System.out.printf("-------------------출판사 번호로 조회 : %d-------------------%n", publisherNo);
		publisher = dao.selectPublisherByPublisherNo(publisherNo);
		System.out.printf("출판사명 : %s%n출판사 주소 : %s%n출판사 전화번호 : %s%n", publisher.getPublisherName(), publisher.getPublisherAddress(), publisher.getPublisherTel());
		System.out.println("*******출간한 책*******");
		for(Book b : publisher.getBookList()){
			System.out.println(b);
		}
		
		System.out.println("------------키워드 검색-----------");
		List<Publisher> list2 = dao.selectPublisherByKeywords(null, null, null);
		for(Publisher p : list2){
			System.out.println(p);
		}
		
		System.out.println("------------키워드 검색 (choose)-----------");
		list2 = dao.selectPublisherByKeyword(null, null);
		for(Publisher p : list2){
			System.out.println(p);
		}
	}
}
