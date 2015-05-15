package com.mycom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycom.model.service.MemberService;
import com.mycom.vo.Member;


@Controller
public class AjaxController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("/ajax/findById.do")
	@ResponseBody // return 되는 값을 http 응답 정보 body에 넣어 출력하라.
	public String findMemberById(@RequestParam String id){
		Member member = service.getMemberById(id);
		String result = String.format("ID : %s<br>이름 : %s<br>나이 : %d",member.getId(),member.getName(),member.getAge());
		return result;
	}
	
	@RequestMapping("/ajax/findById_JSON.do")
	@ResponseBody
	public Member findMemberById_JSON(@RequestParam String id){
		return service.getMemberById(id);
	}
	/*
	 * ResponseBody을 이용해 JSON 문자열 응답처리 하기.
	 *  - MappingJackson2HttpMessageConverter 필요. - 리턴값을 JSON 문자열로 변환해 응답 body에 넣는 컨버터.
	 *  mvc:annotation-driven 설정시 자동으로 등록됨. 단, JacksonJSON API 모듈이 classpath에 있어야함.
	 *  
	 *  return type
	 *   VO, Map -> Json Object : {name:value, name:value,...}
	 *   array, List -> JSON Array : [값,값,값,...]
	 */
			
	@RequestMapping(value="/ajax/memberList.do")
	@ResponseBody
	public List<Member> memberList(){
		return service.getMemberList();
	}
	
}
