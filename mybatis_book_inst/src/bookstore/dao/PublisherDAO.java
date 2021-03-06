package bookstore.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import bookstore.common.util.DatabaseManager;
import bookstore.vo.Publisher;

public class PublisherDAO {
	private String namespace = "bookstore.publisher.";
	private SqlSessionFactory factory;
	private static PublisherDAO instance = new PublisherDAO();

	private PublisherDAO() {
		factory = DatabaseManager.getInstance().getSqlSessionFactory();
	}

	public static PublisherDAO getInstance() {
		return instance;
	}
	
	public int insertPublisher(Publisher publisher){
		SqlSession session = factory.openSession(true);
		try {
			return session.insert(namespace+"insertPublisher", publisher);
		} finally {
			session.close();
		}
	}
	
	public int updatePublisher(Publisher publisher) {
		SqlSession session = factory.openSession(true);
		try {
			return session.update(namespace+"updatePublisher", publisher);
		} finally {
			session.close();
		}
	}
	
	public int deletePbulisherByPublisherNo(int publisherNo) {
		SqlSession session = factory.openSession(true);
		try {
			return session.delete(namespace+"deletePublisherByPublisherNo", publisherNo);
		} finally {
			session.close();
		}
	}
	
	public List<Publisher> selectAllPublishers() {
		SqlSession session = factory.openSession(true);
		try {
			return session.selectList(namespace+"selectAllPublishers");
		} finally {
			session.close();
		}
	}
	
	public List<Publisher> selectPublisherByAddress(String address) {
		SqlSession session = factory.openSession(true);
		try {
			return session.selectList(namespace+"selectPublisherByAddress", address);
		} finally {
			session.close();
		}
	}
	
	public Publisher selectPublisherByPublisherNo(int publisherNo) {
		SqlSession session = factory.openSession(true);
		try {
			return session.selectOne(namespace+"selectPublisherByPublisherNo", publisherNo);
		} finally {
			session.close();
		}
	}
	
	public List<Publisher> selectPublisherByKeywords(String publisherName,String publisherAddress,String publisherTel) {
		SqlSession session = factory.openSession(true);
		Map keywords = new HashMap();
		keywords.put("publisherName", publisherName);
		keywords.put("publisherAddress", publisherAddress);
		keywords.put("publisherTel", publisherTel);
		
		try {
			return session.selectList(namespace+"selectPublisherByKeywords", keywords);
		} finally {
			session.close();
		}
	}
	
   public List<Publisher> selectPublisherByKeyword(String keyword,String value){
      Map param = new HashMap();
      param.put(keyword, value);
      SqlSession session = factory.openSession(true);
      try {
         return session.selectList(namespace+"selectPublisherByKeyword",param);
      } finally  {
          session.close();
      }
   }
	public List<Publisher> selectPublisherByName(String name){
		SqlSession session = factory.openSession(true);
		try {
			return session.selectList(namespace+"selectPublisherByName",name);
		} finally {
			session.close();
		}
	}
}













