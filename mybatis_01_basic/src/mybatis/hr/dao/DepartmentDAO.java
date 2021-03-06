package mybatis.hr.dao;

import java.util.List;
import java.util.Map;

import mybatis.hr.common.DatabaseManager;
import mybatis.hr.vo.Department;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class DepartmentDAO {
	private static DepartmentDAO inst = new DepartmentDAO();
	private SqlSessionFactory sessionFactory;
	
	private DepartmentDAO(){
		sessionFactory = DatabaseManager.getInstance().getSqlSessionFactory();
	}
	public static DepartmentDAO getInstance(){
		return inst;
	}
	
	public int insertDepartment(Department department){
		//SqlSession - SQL문을 실행하는 메소드들을 제공
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.insert("mybatis.hr.dao.department.insertDepartment",department);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public Map selectDepartmentByIdMap(int departmentId){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectOne("mybatis.hr.dao.department.selectDepartmentById",departmentId);
		}finally{
			session.close();
		}
	}
	
	public int updateDepartment(Department department){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.update("mybatis.hr.dao.department.updateDepartment",department);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public int deleteDepartmentById(int departmentId){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.delete("mybatis.hr.dao.department.deleteDepartmentById",departmentId);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public int deleteDepartmentByLocation(String location){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.delete("mybatis.hr.dao.department.deleteDepartmentByLocation",location);
			session.commit();
			return cnt;
		}finally{
			session.close();
		}
	}
	
	public List<Department> selectDepartmentsList(){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList("mybatis.hr.dao.department.selectDepartmentsList");
			
		}finally{
			session.close();
		}
	}
	
	public Map<Integer,Department> selectDepartmentsList_Map(){
		SqlSession session = sessionFactory.openSession();
		try{
			//selectMap()은 1. sql문ID, 2.parameter, 3.map의 key로 사용할 property(PK값을 저장한 Property지정)
			Map map = session.selectMap("mybatis.hr.dao.department.selectDepartmentsList",null,"departmentId");
			return map;
		}finally{
			session.close();
		}
	}
	
	public List selectRandom(String tableName){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList("mybatis.hr.dao.department.selectRandom",tableName);
		}finally{
			session.close();
		}
	}
	
	public List<Department> selectDepartmentByName(String name){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList("mybatis.hr.dao.department.selectDepartmentByName",name);
		}finally{
			session.close();
		}
	}
	
	public List<Department> selectDepartmentByLocation(String location){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList("mybatis.hr.dao.department.selectDepartmentByLocation",location);
		}finally{
			session.close();
		}
	}
	
	public Department selectDepartmentById_JoinEmployee(int departmentId){
		SqlSession session = sessionFactory.openSession();
		try{
		return session.selectOne("mybatis.hr.dao.department.selectDepartmentById_JoinEmployee",departmentId);
		}finally{
			session.close();
		}
	}
	
	public int insertDepartmentSequence(Department department){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.insert("mybatis.hr.dao.department.insertDepartmentSequence",department);
			return cnt;
		}finally{
			session.close();
		}
	}
	
}
