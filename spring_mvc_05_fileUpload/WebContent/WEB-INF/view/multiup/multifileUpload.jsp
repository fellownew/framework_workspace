<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>여러 파일 업로드 처리</h2>
	<form action="/spring_mvc_05_fileUpload/upload/multiup.do" method="POST" enctype="multipart/form-data">
		제목 : <input type="text" name="title"><br>
		파일1 : <input type="file" name="upfile"><br>
		파일2 : <input type="file" name="upfile"><br>
		파일3 : <input type="file" name="upfile"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>