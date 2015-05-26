package spring.aop.common;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;



//공통로직 모음 클래스.
public class LoggerAspect {
	private static Logger logger = Logger.getLogger(LoggerAspect.class);
	//핵심 로직 처리 전에 실행될 공통 로직.
	public void beforeLogger(){
		logger.info("LoggerAspect.beforeLogger()실행");
	}
	
	//핵심로직 처리 후 실행 될 공통 메소드.
	//정상 처리 후 핵심 메소드가 return 한 경우.
	public void afterReturn(Object returnValue){
		logger.info("LoggerAspect.afterReturn()실행.리턴값 : "+returnValue);
	}
	//핵심 로직에서 오류 발생한 후 호출.
	public void afterThrow(Throwable ex){
		logger.error("LoggerAspect.afterThrow()실행",ex);
	}
	
	//around처리 공통 메소드 - 핵심 로직이 실행된 시간을 로그로 기록.
	public Object timeCheckAround(ProceedingJoinPoint jp) throws Throwable{
		try{
			//before
			long start = System.currentTimeMillis();
			long start2 = System.nanoTime();
			Object ret = jp.proceed();//핵심 메소드 호출.
			
			//after-returnning
			long end = System.currentTimeMillis();
			long end2 = System.nanoTime();
			
			logger.info("걸린시간 : "+(end-start)+" - "+(end2-start2));
			return ret;
		}catch(Throwable e){
			//after-throwing
			logger.error("실행도중 오류 발생");
			throw e;
		}
	}
	
}
