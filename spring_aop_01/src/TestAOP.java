import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.core.BusinessService;


public class TestAOP {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/config/aop.xml");
		BusinessService service = (BusinessService)context.getBean("businessService");
		service.businessMethodBefore1();
		System.out.println("-----------------------");
		service.businessMethodBefore2("홍길동");
	}
}
