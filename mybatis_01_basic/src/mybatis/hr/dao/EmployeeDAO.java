package mybatis.hr.dao;

import java.util.List;

import mybatis.hr.common.DatabaseManager;
import mybatis.hr.vo.Employee;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class EmployeeDAO {
	private static EmployeeDAO inst = new EmployeeDAO();
	private SqlSessionFactory sessionFactory;
	private String nameSpace = "mybatis.hr.dao.employee.";
	private EmployeeDAO(){
		sessionFactory = DatabaseManager.getInstance().getSqlSessionFactory();
	}
	
	public static EmployeeDAO getInstance(){
		return inst;
	}
	
	public List<Employee> selectAllEmployee(){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(nameSpace+"selectAllEmployees");
		}finally{
			session.close();
		}
	}
}
