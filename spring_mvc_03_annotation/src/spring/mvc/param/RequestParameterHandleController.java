package spring.mvc.param;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/param")
//handler(Controller 로직처리) 메소드에 설정된 @RequestMapping 앞에 공통적으로 붙을 url 설정.
public class RequestParameterHandleController {
	/***********************
	 * Handler Method들 (Controller 로직 처리 메소드들)
	 ************************/
//	@RequestMapping("/requestForm.do")
//	public String requestForm(){
//		//request_form.jsp로 이동하는 controller 메소드
//		return "request_form.jsp";
//	}
	
	//요청 파라미터를 String 변수로 받기. 넘어온 파라미터 name과 매개변수를 매칭시켜 받아옴.
	@RequestMapping("/login.do")
	public String login(@RequestParam(required=false, defaultValue="기본값") String id,String password,HttpSession session){
		System.out.println(id +"-"+password);
		session.setAttribute("loginInfo", id);
		return "request_result.jsp";
	}
	
	@RequestMapping("/variousType.do")
	public String variousType(int age,double tall,boolean mailing){
		System.out.printf("나이 : %d, 키 : %2f, 메일수신 : %s",age,tall,mailing?"허용":"거부");
		return "request_result.jsp";
	}
	
	//같은 일므으로 여러개 요청 파라미터들이 넘어온 경우 처리.
	@RequestMapping("/manyParams.do")
	//Model||ModelMap||Map - view에게 전달할 값을 설정하는 객체를 받을 변수
	public String manyParams(String []txt, Model model){
		for(String s : txt){
			System.out.println(s);
		}
		model.addAttribute("key","value");
		model.addAttribute("key2","value2");
		return "request_result.jsp";
	}
}
