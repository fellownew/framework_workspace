package spring.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	//로그인 여부 체크, 미로그인시 request.jsp로 이동 시킴.
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		Object loginFlag = session.getAttribute("loginInfo");
		if(loginFlag==null){
			throw new ModelAndViewDefiningException(new ModelAndView("/request.jsp","errorMessage","로그인 먼저 하세요"));
		}else{
			return true;
		}
	}
	
}
