package mybatis.hr.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import mybatis.hr.dao.DepartmentDAO;
import mybatis.hr.vo.Department;

public class TestDepartment {
	public static void main(String[] args) {
		DepartmentDAO dao = DepartmentDAO.getInstance();
		Department dept = new Department(654,"654부서","서울");
		int cnt = dao.insertDepartment(dept);
		System.out.println("insert 확인 : "+cnt);
		System.out.println("- 부서 ID로 부서 조회 - ");
		Map map = dao.selectDepartmentByIdMap(600);
		System.out.println(map);
		cnt = dao.updateDepartment(new Department(654,"654특별부서","대전"));
		System.out.println(cnt);
		Map map1 = dao.selectDepartmentByIdMap(654);
		System.out.println(map1);
		cnt = dao.deleteDepartmentByLocation("대전");
		System.out.println("삭제여부 : "+cnt);
		//리스트는 전체조회, 맵은 key로 값을 찾는 경우가 편함.
		//쿼리는 같은 쿼리를 사용함.
		List<Department> list = dao.selectDepartmentsList();
		for(Department o:list){
			System.out.println(o);
		}
		System.out.println("-Map으로 가져오기-");
		Map<Integer,Department> mapList = dao.selectDepartmentsList_Map();
		Set keys = mapList.keySet();
		for(Object key:keys){
			System.out.println(mapList.get(key));
		}
	}
}
