package spring.calc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import spring.calc.vo.Operand;

public class CalculatorController extends MultiActionController{
	
	public String calcForm(HttpServletRequest request,HttpServletResponse response){
		return "calculator_form";
	}
	
	public String index(HttpServletRequest request,HttpServletResponse response){
		return "index";
	}
	//보여주어야 하는것 뿐만 아니라 값을 건네주어야 하기때문에 ModelAndView로 리턴함
	public ModelAndView plus(HttpServletRequest request,HttpServletResponse response){
		
		//요청 파라미터 조회
		int op1 = Integer.parseInt(request.getParameter("op1"));
		int op2 = Integer.parseInt(request.getParameter("op2"));
		
		//비지니스 로직 (원래는 MVC의 Model을 호출)
		int result = op1+op2;
		
		//응답
		return new ModelAndView("result","result",result);
	}

	public ModelAndView minus(HttpServletRequest request,HttpServletResponse response,Operand op){
		
		int result = op.getOp1()-op.getOp2();
		
		return new ModelAndView("result","result",result);
	}
	
	
}
