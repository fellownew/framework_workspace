package pub.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DatabaseManager {
	private static DatabaseManager inst = new DatabaseManager();
	private SqlSessionFactory sessionFactory;
	private DatabaseManager(){
		InputStream is = null;
		try{

			is = Resources.getResourceAsStream("publisher-config.xml");

		}catch(IOException e){
			e.printStackTrace();
		}
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		sessionFactory = builder.build(is);
		
	}
	public static DatabaseManager getInstance(){
		return inst;
	}
	public SqlSessionFactory getSqlSessionFactory(){
		return sessionFactory;
	}

}
