package spring.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.hello.EnHello;
import spring.di.hello.Hello;
import spring.di.hello.KorHello;

public class TestHello {
	Hello hello;
	public TestHello(Hello hello){
		this.hello = hello;
	}
	public void printGreeting(){
		String name = "김철수";
		String g = hello.sayHello(name);
		System.out.println(g);
	}
	public static void main(String[] args) {
//		EnHello hello = new EnHello();
//		KorHello Hello = new KorHello();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/config/hello.xml");
		/*		Hello hello = (Hello)ctx.getBean("hello");
		TestHello th = new TestHello(hello);
		th.printGreeting();*/
		
		TestHello thello = (TestHello)ctx.getBean("testHello");
		thello.printGreeting();
		
	}
}
