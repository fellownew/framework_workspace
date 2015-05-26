package sop.core;

import sop.cross.CrossCustionAspect;

public class CoreServiceProxy  implements CoreService{
	@Override
	public void coreMethod1(){
		CoreServiceImpl core = new CoreServiceImpl();
		CrossCustionAspect cross=new CrossCustionAspect();
		//핵심 로직 호출
		core.coreMethod1();
		//공통 로직 호출
		cross.commonMethod();
	}
	@Override
	public void coreMethod2(){
		CoreServiceImpl core = new CoreServiceImpl();
		CrossCustionAspect cross=new CrossCustionAspect();
		//핵심 로직 호출
		core.coreMethod2();
		//공통 로직 호출
		cross.commonMethod();
	}
}