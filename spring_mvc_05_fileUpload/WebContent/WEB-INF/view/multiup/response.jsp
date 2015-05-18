<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Multi response</title>
</head>
<body>
	<h2>여러파일 응답페이지</h2>
	제목 : ${requestScope.title }<br>
	파일 다운로드 <br>
	<c:forEach items="${requestScope.fileNames }" var="name">
		<a href="/spring_mvc_05_fileUpload/upload/${name }">${name }</a>
	</c:forEach>
<hr>
	<h2>다운로드 뷰를 이용한 다운로드 처리</h2>
	제목 : ${requestScope.title }<br>
	파일 다운로드 <br>
	<c:forEach items="${requestScope.fileNames }" var="name">
		<a href="/spring_mvc_05_fileUpload/upload/download.do?filename=${name }">${name }</a>
	</c:forEach>
</body>
</html>