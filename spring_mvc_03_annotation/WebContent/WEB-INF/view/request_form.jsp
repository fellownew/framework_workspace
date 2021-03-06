<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request_form</title>
</head>
<body>
<h2>@RequestPara을 이용한 요청 파라미터 처리</h2>
<h4>로그인</h4>
	<form action="login.do" method="post">
		ID : <input type="text" name="id"><br>
		Password : <input type="password" name="password"><br>
		<input type="submit" value="전송">
	</form>
	
<h4>다양한 타입의 요청 파라미터 처리</h4>
	<form action="variousType.do">
		정수 - 나이 : <input type="text" name="age"><br>
		실수 - 키 : <input type="text" name="tall"><br>
		boolean : <input type="radio" value="true" name="mailing">받기
				<input type="radio" value="false" name="mailing">안받기<br>
		<input type="submit" value="전송">
	</form>
	
<h4>같은 이름으로 여러개의 요청 파라미터 값들 전송 처리</h4>
	<form action="manyParams.do" method="post">
		<input type="text" name="txt"><br>
		<input type="text" name="txt"><br>
		<input type="text" name="txt"><br>
		<input type="text" name="txt"><br>
		<input type="text" name="txt"><br>
		<input type="submit" value="전송">
	</form>

</body>
</html>