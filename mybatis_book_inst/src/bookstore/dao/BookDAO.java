package bookstore.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import bookstore.common.util.DatabaseManager;
import bookstore.vo.Book;

public class BookDAO {
	
	private String namespace="bookstore.book.";
	private SqlSessionFactory factory;
	private static BookDAO instance = new BookDAO();

	private BookDAO() {
		factory = DatabaseManager.getInstance().getSqlSessionFactory();
	}

	public static BookDAO getInstance() {
		return instance;
	}
	
	public int insertBook(Book book) {
		SqlSession session = factory.openSession(true);
		try {
			return session.insert(namespace+"insertBook", book);
		} finally {
			session.close();
		}
	}
	
	public int updateBook(Book book) {
		SqlSession session = factory.openSession(true);
		try {
			return session.update(namespace+"updateBook", book);
		} finally {
			session.close();
		}
	}
	
	public int deleteBookByISBN(String isbn) {
		SqlSession session = factory.openSession(true);
		try {
			return session.delete(namespace+"deleteBookByISBN", isbn);
		} finally {
			session.close();
		}
	}
	
	public List<Book> selectAllBooks() {
		SqlSession session = factory.openSession(true);
		try {
			return session.selectList(namespace+"selectAllBooks");
		} finally {
			session.close();
		}
	}
	public List<Book> selectBookByAuthor(String author) {
		SqlSession session = factory.openSession(true);
		try {
			return session.selectList(namespace+"selectBookByAuthor", author);
		} finally {
			session.close();
		}
	}
	public List<Book> selectBookByPublishDateRange(Date start, Date end) {
		SqlSession session = factory.openSession(true);
		HashMap<String, Date> map = new HashMap<String, Date>();
		map.put("start", start);
		map.put("end", end);
		try {
			return session.selectList(namespace+"selectBookByPublishDateRange", map);
		} finally {
			session.close();
		}
	}
	
	public Book selectBookByISBN(String isbn) {
		SqlSession session = factory.openSession(true);
		try {
			return session.selectOne(namespace+"selectBookByISBN", isbn);
		} finally {
			session.close();
		}
	}
	
	
}
