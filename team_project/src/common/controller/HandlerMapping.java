package common.controller;


public class HandlerMapping {
	
	public static Controller getController(String command){
		Controller controller=null;
		if(command==null){
			controller = new ErrorController();
		}else{
			if(command.equals("register")){
				//등록 컨트롤러 호출
				//controller = new RegisterController();
			}else if(command.equals("registerSuccess")){
				//조회 컨트롤러 호출
				//controller = new RegisterSuccessController();
			}else{
				controller = new ErrorController();
			}
		}
		return controller;
	}
}
