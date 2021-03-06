package spring.mvc.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

public class DownloadView extends AbstractView{
	private String uploadDir = "C:\\JAVA\\apache-tomcat-7.0.59\\webapps\\spring_mvc_05_fileUpload\\upload";
	public String getContextType(){
		
		return "application/octet-stream";//형식이 지원되지 않는 어플리케이션의 타입 지정.
	}

	public void renderMergedOutputModel(Map<String, Object> model,HttpServletRequest request, HttpServletResponse response) throws Exception {
		//model정보(ModelAndView)로 다운로드할 파일의 이름을 받아온다.
		String fileName = (String)model.get("downFile");
		//응답 내용의 타입(응답 content-type)을 설정
		response.setContentType(getContextType());
		String newFileName = new String(fileName.getBytes("euc-kr"),"8859_1");
		//응답 헤더에 다운로드 파일명 지정.
		response.setHeader("Content-Disposition", "attachment;filename="+newFileName);
		
		File file = new File(uploadDir,fileName);
		FileInputStream fis = new FileInputStream(file);
		OutputStream os = response.getOutputStream();
		FileCopyUtils.copy(fis,os);//fis로 읽은 것을 os로 카피함.
	}
	
	
}
