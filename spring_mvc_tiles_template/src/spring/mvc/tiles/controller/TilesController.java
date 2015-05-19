package spring.mvc.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	
	
	@RequestMapping("/mainpage.do")
	public String mainPage(){
		return "main.tiles";
	}
	@RequestMapping("/join_form.do")	
	public String join_form(){
		return "member/join_form.tiles";
	}
	@RequestMapping("/register_form.do")	
	public String register_form(){
		return "product/register_form.tiles";
	}
	@RequestMapping("/no_tiles.do")	
	public String no_tiles(){
		return "/WEB-INF/view//no_tiles.jsp";
	}
	
}
