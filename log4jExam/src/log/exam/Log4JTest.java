package log.exam;

import org.apache.log4j.Logger;

public class Log4JTest {
	//Logger 객체 조회 = getLogger(Logger 식별값) : log4j 설정 파일을 읽어 그 설정에 맞게 일하는 Logger객체 리턴.
	private static Logger logger = Logger.getLogger(Log4JTest.class);
	
	public static void main(String[] args) {
		logger.info("main method start");
		Log4JTest test = new Log4JTest();
		test.writeLogger();
		logger.info("main method end");
	}
	
	public void writeLogger(){
		//로그 레벨별로 로그 남기기
		if(logger.isDebugEnabled()){ //Logger가 DEBUG 레벨 로그를 남길 수 있는 상태라면.
			logger.debug("debug level log");
		}
		if(logger.isInfoEnabled()){
			logger.info("info level log");
		}
		logger.warn("warn level log");
		
		try{
			Integer.parseInt("abd");
		}catch(Exception e){
			e.printStackTrace();
			logger.error("error level log");
			logger.fatal("fatal level log");
		}
	}
	
}
