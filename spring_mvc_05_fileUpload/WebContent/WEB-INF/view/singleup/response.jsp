<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Single Response</title>
</head>
<body>
	제목 : ${requestScope.title }<br>
	정보 : ${requestScope.info }<br>
	파일명 : ${requestScope.filename }<br>
	파일 크기 : ${requestScope.filesize } byte<br>
	<img src="/spring_mvc_05_fileUpload/upimage/${requestScope.filename }"/>
</body>
</html>