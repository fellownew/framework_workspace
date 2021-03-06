package spring.aop.core;

import java.io.IOException;

public class BusinessServiceImp implements BusinessService{

	@Override
	public void businessMethodBefore1() {
		System.out.println("핵심로직.MethodBefore1()");
	}

	@Override
	public void businessMethodBefore2(String name) {
		System.out.println("핵심로직.MethodBefore2()"+name+"을 받음..");
	}

	@Override
	public String businessMethodReturn() {
		System.out.println("핵심로직.businessMethodReturn");
		return "리턴값";
	}

	@Override
	public void businessMethodThrow() throws Exception {
		System.out.println("핵심로직.businessMethodThrow() 실행 중 예외 발생");
		throw new IOException("IOException 발생");
	}
	
}
