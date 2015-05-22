package spring.aop.core;

public class BusinessServiceImp implements BusinessService{

	@Override
	public void businessMethodBefore1() {
		System.out.println("핵심로직.MethodBefore1()");
	}

	@Override
	public void businessMethodBefore2(String name) {
		System.out.println("핵심로직.MethodBefore2()"+name+"을 받음..");
	}
	
}
