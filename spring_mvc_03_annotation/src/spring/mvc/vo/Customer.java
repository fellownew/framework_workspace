package spring.mvc.vo;

import java.util.Arrays;
import java.util.List;

public class Customer {
	private String id;
	private String password;
	private String name;
	private String email;
	private int salary;
	private boolean marriage;
	private String[] hobby;
	private List interest;
	public Customer(){}
	public Customer(String id, String password, String name, String email,
			int salary, boolean marriage, String[] hobby, List interest) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.marriage = marriage;
		this.hobby = hobby;
		this.interest = interest;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isMarriage() {
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public List getInterest() {
		return interest;
	}
	public void setInterest(List interest) {
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", password=" + password + ", name="
				+ name + ", email=" + email + ", salary=" + salary
				+ ", marriage=" + marriage + ", hobby="
				+ Arrays.toString(hobby) + ", interest=" + interest + "]";
	}
	
	
	
}
