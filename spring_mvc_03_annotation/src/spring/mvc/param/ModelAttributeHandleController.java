package spring.mvc.param;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.validation.CustomerValidator;
import spring.mvc.vo.Customer;

@Controller
@RequestMapping("/modelAttr")
public class ModelAttributeHandleController {
	
	@RequestMapping("/register.do")
	public String register(@ModelAttribute("cvo") Customer customer,HttpSession session){
		
		
		
		System.out.println(customer);
		session.setAttribute("info", customer);
		return "register_result.jsp";
	}
	@RequestMapping("/register_valid.do")
	public String registerValidate(@ModelAttribute Customer customer,Errors errors){
		CustomerValidator validator=new CustomerValidator();
		validator.validate(customer, errors);
		//Errors 조회 - hasErrors() : boolean
		System.out.println("총 에러 수 "+errors.getErrorCount());
		if(errors.hasErrors()){
			return "register_valid_form.jsp";
		}
		return "register_result.jsp";
	}
		
}
