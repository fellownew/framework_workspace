package common.controller;

import java.util.HashMap;
import java.util.Map;
/*
 * 업무 처리 Controller의 리턴 타입으로 사용될 VO 클래스
 */


public class AttributeAndView {
	private boolean redirect; //응답 방식 : true면 리다이렉트, false면 요청디스패치
	private String url; //이동할 URL
	private Map<String,Object> attributes;
	
	public AttributeAndView(boolean redirect, String url) {
		this.redirect = redirect;
		this.url = url;
	}
	//request scope에 binding 할 속성들을 Map으로 받아 전달함.. (속성이 여러개일 경우 사용)

	public AttributeAndView(boolean redirect, String url,Map<String,Object> attributes) {
		this.redirect = redirect;
		this.url = url;
		this.attributes = attributes;
	}
	//request scope에 binding 할 속성의 name과 속성객체를 받아 전달함.. (속성이 한개일 경우 사용)
	public AttributeAndView(boolean redirect, String url,String attributeName,Object attribute) {
		this.redirect = redirect;
		this.url = url;
		attributes = new HashMap();
		attributes.put(attributeName, attribute);
	}
	
	
	
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	
	
}
