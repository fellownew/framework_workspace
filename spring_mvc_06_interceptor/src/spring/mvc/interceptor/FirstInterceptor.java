package spring.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/*
 * Interceptor 구현
 * 	- HandlerInterceptor를 implements - 보통 메소드를 모두 구현할때 사용
 * 	- HandlerInterceptorAdapter를 extends - 보통 일부분의 메소드만 구현할때 사용
 * 
 * callback 메소드 overriding
 *  - preHandle() : controller 호출 전에 호출될 메소드
 *  - postHandle() : controller 수행 후에 호출될 메소드
 *  - afterCompletion() : View가 실행된 후(클라이언트에게 응답처리 후) 호출될 메소드.
 *  
 *  Spring 설정파일에 등록 - spring Container에게 등록(알려주는 것)
 *  <mvc:interceptors> - <mvc:interceptor>
 */
public class FirstInterceptor implements HandlerInterceptor{

	@Override
	//false 리턴시 controller는 호출되지 않는다.
	//3번 매개변수 : Controller 객체.
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object obj) throws Exception {
		System.out.println("FirstInterceptor.preHandle()");
		return true;
	}
	
	@Override
	//controller에서 예외가 발생한 경우(처리 안되고 던져진 경우)는 호출되지 않음.
	//3번 : controller 객체, 4번 : controller가 return ModelAndView
	public void postHandle(HttpServletRequest request, HttpServletResponse response,Object obj, ModelAndView mav) throws Exception {
		System.out.println("FirstInterceptor.postHandle()");		
	}
	
	@Override
	//사용자 요청과 관련된 모든 요청이 다 끝난 뒤 호출됨.
	// controller, View 에서 예되가 던져저도 실행됨.
	//4번 : Contoller 나 View에서 던져진 예외가 있을 경우 그 예외 객체
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object obj, Exception exception)throws Exception {
		System.out.println("FirstInterceptor.afterComletion()");		
	}


	
}
