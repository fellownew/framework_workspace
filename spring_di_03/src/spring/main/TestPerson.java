package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.vo.Address;
import spring.di.vo.Person;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/di/config/person_property.xml");
		Address address = null;
		Person person = null;
		address = (Address)ctx.getBean("address1");
		System.out.println(address);
		address = (Address)ctx.getBean("address2");
		System.out.println(address);
		
		person = (Person)ctx.getBean("person");
		System.out.println(person);
		person = (Person)ctx.getBean("person2");
		System.out.println(person);
		
	}
}
