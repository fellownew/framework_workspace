<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/menu.jsp"/>

<h2>회원목록</h2> 	

<c:if test="${fn:length(requestScope.memberList) != 0 }"><!-- 회원정보가 있으면 -->
	<table width="700" border='1'>
		<thead>
			<tr>
				<td>ID</td>
				<td>Password</td>
				<td>이름</td>
				<td>이메일</td>
				<td>가입일자</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.memberList }" var="member">
				<tr>
					<td>${member.id }</td>
					<td>${member.password}</td>
					<td>${member.name}</td>
					<td>${member.email}</td>
					<td>${member.joinDate}</td>
				</tr> 
			</c:forEach>
		</tbody>
	</table>
</c:if>
<c:if test="${requestScope.preGroup }">
	<a href="/MemberManagerFC/controller?command=memberPagingList&page=${requestScope.startPage-1 }" >◁</a>
</c:if>
	<c:forEach begin="${requestScope.startPage }" end="${requestScope.endPage }" var="p">
	
	<a href="/MemberManagerFC/controller?command=memberPagingList&page=${p }">&nbsp;${p } &nbsp;
	</a>
	
	</c:forEach>

<c:if test="${requestScope.nextGroup }">
	<a href="/MemberManagerFC/controller?command=memberPagingList&page=${requestScope.endPage +1}">▷</a>
</c:if>

</body>
</html>