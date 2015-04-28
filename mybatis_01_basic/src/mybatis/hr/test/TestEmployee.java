package mybatis.hr.test;

import java.util.List;

import mybatis.hr.dao.EmployeeDAO;
import mybatis.hr.vo.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		EmployeeDAO dao = EmployeeDAO.getInstance();
		List<Employee> list = dao.selectAllEmployee();
		for(Employee emp:list){
			System.out.println(emp);
		}
	}
}
