package member.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import common.controller.AttributeAndView;
import common.controller.Controller;
import common.util.PagingBean;

public class MemberPagingListController implements Controller {

	 
	@Override
	public AttributeAndView handle(HttpServletRequest request, HttpServletResponse response){
		AttributeAndView av = null;
		try {
			MemberService ms = MemberService.getInstance();
			int page = Integer.parseInt(request.getParameter("page"));
			Map<String,Object> map = ms.getMemberListPaging(page);
			av = new AttributeAndView("/WEB-INF/view/member/member_list_paging.jsp", false, map);
		} catch (Exception e) {
			e.printStackTrace();
			av = new AttributeAndView("/WEB-INF/view/error.jsp", false, "error_message", e.getMessage());
		}
		return av;
	}
}
