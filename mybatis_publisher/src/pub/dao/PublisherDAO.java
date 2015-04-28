package pub.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pub.common.DatabaseManager;
import pub.vo.Publisher;

public class PublisherDAO {
	private static PublisherDAO inst = new PublisherDAO();
	private SqlSessionFactory sessionFactory;
	private String ns = "pub.dao.publisher.";
	
	private PublisherDAO(){
		sessionFactory = DatabaseManager.getInstance().getSqlSessionFactory();
	}
	
	public static PublisherDAO getInstance(){
		return inst;
	}
	
	public int insertPublisher(Publisher publisher){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.insert(ns+"insertPublisher",publisher);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
		
	public int deletePublisherByNo(int publisherNo){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.delete(ns+"deletePublisherByNo",publisherNo);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public int updatePublisher(Publisher publisher){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.update(ns+"updatePublisher",publisher);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public List<Publisher> selectAllPublisher(){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(ns+"selectAllPublisher");
		}finally{
			session.close();
		}
	}
	
	public List<Publisher> selectPublisherByAddress(String address){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(ns+"selectPublisherByAddress",address);
		}finally{
			session.close();
		}
	}
	
	public List<Publisher> selectPublisherByNo(int publisherNo){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(ns+"selectPublisherByNo",publisherNo);
		}finally{
			session.close();
		}
	}
	
}
