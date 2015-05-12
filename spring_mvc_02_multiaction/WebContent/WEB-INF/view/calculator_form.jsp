<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 하기</title>
</head>
<body>
	<form action="calc.do" method="post">
		<input type="hidden" name="command" value="plus">
		<input type="number" name="op1"> + <input type="number" name="op2">
		<input type="submit" value="덧셈 계산">
	</form>
	
	<form action="calc.do" method="post">
		<input type="hidden" name="command" value="minus">
		<input type="number" name="op1"> - <input type="number" name="op2">
		<input type="submit" value="뺄셈 계산">
	</form>
</body>
</html>