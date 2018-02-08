<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	img{
			margin: 8px;
			width: 160px;
			height: 40px;
		}
	#logoA{
		padding-top: 10px;
		padding-left: 10px;
		margin-right: 65%;
		font-size: 30px;
	}
	#buttonSpan{
		width: 40px;
		height: 30px;
	}
	.buttons{
		margin:3px;
	}
	#hrDiv{
		margin-top: 8px;
		height: 6px;
		background-color: gray;
	}
</style>
<script type="text/javascript">
	function engineerClick(){
		location.href="../manager/main_to_engineerManage.do";
	}
	function carClick(){
		location.href="../car/main_to_carManage.do";
	}
	function objectClick(){
		location.href="../object/main_to_objectManage.do";
	}
</script>
</head>
<body>
	<a href="../manager/goMain.do" id="logoA">
		<img alt="logo" src="https://orig00.deviantart.net/fae8/f/2011/288/4/5/coca_cola_logo_png_by_ivettecaro-d4cxaok.png">
	</a>
	<span id="buttonSpan">
		<input type="button" class="buttons" name="main_to_engineerManage" value="회원관리" onclick="engineerClick()">
		<input type="button" class="buttons" name="main_to_carManage" value="차량관리" onclick="carClick()">
		<input type="button" class="buttons" name="main_to_objectManage" value="방문목적" onclick="objectClick()">
		<input type="button" class="buttons" name="logout_btn" value="로그아웃" onclick="logoutClick()">
	</span>
	<div id="hrDiv"></div>
</body>
</html>