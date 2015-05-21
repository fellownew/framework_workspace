package sop;

import sop.core.CoreService;
import sop.core.CoreServiceProxy;

public class TestAop {
	public static void main(String[] args) {
		CoreService c=getBean();
		c.coreMethod1();
		System.out.println("--");
		c.coreMethod2();
	}
	
	public static CoreService getBean(){
		CoreServiceProxy proxy = new CoreServiceProxy();
		return proxy;
	}
	
}
