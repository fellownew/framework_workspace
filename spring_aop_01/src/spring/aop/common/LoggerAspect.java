package spring.aop.common;

import org.apache.log4j.Logger;



//공통로직 모음 클래스.
public class LoggerAspect {
	private static Logger logger = Logger.getLogger(LoggerAspect.class);
	
	public void beforeLogger(){
		logger.info("LoggerAspect.beforeLogger()실행");
	}
	
	
}
