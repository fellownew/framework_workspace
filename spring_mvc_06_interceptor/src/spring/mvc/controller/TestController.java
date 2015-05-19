package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/test1.do")
	public String test1(){
		System.out.println("TestController.test1() 실행");
		return "response.jsp";
	}
	
	@RequestMapping("/**/test2.do")
	public String test2(){
		
		return "response.jsp";
	}
}