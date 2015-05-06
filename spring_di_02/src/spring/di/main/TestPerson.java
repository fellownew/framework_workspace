package spring.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.vo.Address;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/di/config/person.xml");
		Address address = (Address)ctx.getBean("address1");
		System.out.println(address);
		address = (Address)ctx.getBean("address2");
		System.out.println(address);
		address = (Address)ctx.getBean("address3");
		System.out.println(address);
		address = (Address)ctx.getBean("address4");
		System.out.println(address);
	}
}
