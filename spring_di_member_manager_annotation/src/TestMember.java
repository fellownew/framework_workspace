import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import member.model.service.MemberService;


public class TestMember {

	public static void main(String[] args) throws Exception{
		
		MemberService service = null;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("common/config/member_service.xml");
		service = (MemberService)ctx.getBean("service");
		System.out.println(service.getMemberById("id-11"));

	}

}
