package mybatis.hr.vo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
	private int employeeId;
	private String employeeName;
	private String email;
	private String jobPosition;
	private long salary;
	private Date hireDate;
	private int departmentId;//부모테이블(Department)의PK -> d_id, d_name,loc
	private Department department;//직원이 다니는 부서의 데이터를 넣을 VO
	public Employee(){}
	public Employee(int employeeId, String employeeName, String email,
			String jobPostion, long salary, Date hireDate, int departmentId,
			Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.jobPosition = jobPostion;
		this.salary = salary;
		this.hireDate = hireDate;
		this.departmentId = departmentId;
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobPostion() {
		return jobPosition;
	}
	public void setJobPostion(String jobPostion) {
		this.jobPosition = jobPostion;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((department == null) ? 0 : department.hashCode());
		result = prime * result + departmentId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + employeeId;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result
				+ ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result
				+ ((jobPosition == null) ? 0 : jobPosition.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (departmentId != other.departmentId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (hireDate == null) {
			if (other.hireDate != null)
				return false;
		} else if (!hireDate.equals(other.hireDate))
			return false;
		if (jobPosition == null) {
			if (other.jobPosition != null)
				return false;
		} else if (!jobPosition.equals(other.jobPosition))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "사원 정보 [사원번호 : " + employeeId + ", 사원명 : "
				+ employeeName + ", 이메일 : " + email + ", 직급 : "
				+ jobPosition + ", 급여 : " + salary + ", 입사일 : " + hireDate
				+ ", 부서번호 : " + departmentId + ", "
				+ department + "]";
	}
	
}
