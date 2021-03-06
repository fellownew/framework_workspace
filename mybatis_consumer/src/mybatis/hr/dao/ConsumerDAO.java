package mybatis.hr.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import mybatis.hr.vo.Consumer;
import mybatis.hr.vo.Mileage;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConsumerDAO {
	private static ConsumerDAO inst = new ConsumerDAO();
	private SqlSessionFactory sessionFactory;
	private String src = "mybatis.hr.dao.consumer.";
	
	private ConsumerDAO(){
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("static-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		sessionFactory = builder.build(is);
	}
	public static ConsumerDAO getInstance(){
		return inst;
	}
	
	public int insertConsumer(Consumer consumer){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.insert(src+"insertConsumer",consumer);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public int updateConsumer(Consumer consumer){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.update(src+"updateConsumer",consumer);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public int deleteConsumerById(String id){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.delete(src+"deleteConsumerById",id);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public List<Consumer> selectConsumerById(String id){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(src+"selectConsumerById", id);
		}finally{
			session.close();
		}
	}
	
	public List<Consumer> selectConsumerByName(String name){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(src+"selectConsumerByName", name);
		}finally{
			session.close();
		}
	}
	
	public List<Consumer> selectConsumerByEmail(String email){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(src+"selectConsumerByEmail", email);
		}finally{
			session.close();
		}
	}
	
	public List<Consumer> selectConsumerByMileageRange(Mileage mileage){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(src+"selectConsumerByMileageRange", mileage);
		}finally{
			session.close();
		}
	}
	
}
