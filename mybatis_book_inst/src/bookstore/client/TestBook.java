package bookstore.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import bookstore.dao.BookDAO;
import bookstore.vo.Book;


public class TestBook {
	public static void main(String[] args) {
		BookDAO dao = BookDAO.getInstance();
		int isbnNum = (int)(Math.random()*70000000)+1;
		int pageNum = (int)(Math.random()*750)+1;
		Book insertBook = new Book(isbnNum+"", "우리책", "이저자", pageNum, pageNum*10, new Date(), (isbnNum%5+1));
		
		dao.insertBook(insertBook);
		
		Book updateBook = new Book("5218971996676", "제목변경", "이저자", pageNum, pageNum*10, new Date(), (isbnNum%5+1));
		dao.updateBook(updateBook);
		
		dao.deleteBookByISBN("3358407");
		
		List<Book> list = null;
		System.out.println("--------------책 전체 조회-------------------");
		list = dao.selectAllBooks();
		for(Book b : list){
			System.out.println(b);
		}
		String author = "김저자";
		System.out.printf("--------------저자로 조회 : %s---------------%n", author);
		list = dao.selectBookByAuthor(author);
		for(Book b : list){
			System.out.println(b);
		}
		Date start = new Date(110, 2, 1);
		Date end = new Date(115, 0,1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.printf("----------출판일 범위로 조회 : %s~%s-----------%n", sdf.format(start), sdf.format(end));
		list = dao.selectBookByPublishDateRange(start, end);
		for(Book b : list){
			System.out.println(b);
		}
		String isbn = "5218971996676";
		System.out.printf("---------------------isbn으로 책 조회 : isbn -%s----------------%n", isbn);
		Book book = dao.selectBookByISBN(isbn);
		System.out.printf("책제목 : %s%n저자 : %s%n페이지 : %d%n가격 : %d%n",book.getTitle(), book.getAuthor(), book.getPage(), book.getPrice());
		System.out.println("*****출판사 정보");
		System.out.println(book.getPublisher());
	}
}


















