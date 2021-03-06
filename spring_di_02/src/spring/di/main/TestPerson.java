package spring.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.vo.Address;
import spring.di.vo.Person;

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
		
		Person person = (Person)ctx.getBean("person1");
		System.out.println(person);
		person = (Person)ctx.getBean("person2");
		System.out.println(person);
		person = (Person)ctx.getBean("person3");
		System.out.println(person);
		person = (Person)ctx.getBean("person4");
		System.out.println(person);
		person = (Person)ctx.getBean("person5");
		System.out.println(person);
		person = (Person)ctx.getBean("person6");
		System.out.println(person);
		person = (Person)ctx.getBean("person7");
		System.out.println(person);
		person = (Person)ctx.getBean("person8");
		System.out.println(person);
		
	}
}
