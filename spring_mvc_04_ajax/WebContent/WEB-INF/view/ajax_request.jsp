<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${initParam.rootPath }/script/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#searchBtn").on("click",function(){
			$.ajax({
				url:"${initParam.rootPath}/ajax/findById.do",
				type:"POST",
				data:{id:$("#id").val()}, //요청 파라미터
				dataType:"text",
				beforeSend:function(){
					if($("#id").val()==""){
						alert("조회할 id 입력 바람.");
						return false;
					}
				},
				success:function(txt){
					alert(txt);
					$("#layer").html(txt);
				}
			})
		});
		
		$("#j_searchBtn").on("click",function(){
			$.ajax({
				url:"${initParam.rootPath}/ajax/findById_JSON.do",
				type:"POST",
				data:{id:$("#id").val()}, //요청 파라미터
				dataType:"json",
				beforeSend:function(){
					if($("#id").val()==""){
						alert("조회할 id 입력 바람.");
						return false;
					}
				},
				success:function(txt){
					alert(txt);
					$("#layer").html(txt);
				}
			})
		});
		
		$("#listBtn").on("click",function(){
			$.ajax({
				url:"${initParam.rootPath}/ajax/memberList.do",
				type:"POST",
				dataType:"json",
				success:function(txt){
					alert(txt);
				}
			})
		});
		
	});
</script>
</head>
<body>
<h2>Ajax 요청</h2>
ID : <input type="text" id="id">
<button id="searchBtn">ID로 조회</button>
<button id="j_searchBtn">ID로 조회 - JSON</button>
<div id="layer"></div>
<p>
<button id="listBtn">전체조회</button>

</body>
</html>