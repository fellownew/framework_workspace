<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>계산 결과</h2>
${requestScope.result }<p/>
<a href="calc.do?command=calcForm">form 가기</a>
</body>
</html>