package pub.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pub.common.DatabaseManager;
import pub.vo.Book;

public class BookDAO {
	private static BookDAO inst = new BookDAO();
	private SqlSessionFactory sessionFactory;
	private String ns = "pub.dao.book.";
	
	private BookDAO(){
		sessionFactory = DatabaseManager.getInstance().getSqlSessionFactory();
	}
	public static BookDAO getInstance(){
		return inst;
	}
	
	public int insertBook(Book book){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.insert(ns+"insertBook",book);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	public int deleteBookByIsbn(String isbn){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.delete(ns+"deleteBookByIsbn",isbn);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public int updateBook(Book book){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.update(ns+"updateBook",book);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public List<Book> selectAllBook(){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(ns+"selectAllBook");
		}finally{
			session.close();
		}
	}
	
	public List<Book> selectBookByAuthor(String author){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(ns+"selectBookByAuthor",author);
		}finally{
			session.close();
		}
	}
	
	public List<Book> selectBookBetweenDate(String date1,String date2){
		SqlSession session = sessionFactory.openSession();
		String[] darr={date1,date2};
		try{
			return session.selectList(ns+"selectBookBetweenDate",darr);
		}finally{
			session.close();
		}
	}
	
	public List<Book> selectBookByIsbn(String isbn){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(ns+"selectBookByIsbn",isbn);
		}finally{
			session.close();
		}
	}
	
}
