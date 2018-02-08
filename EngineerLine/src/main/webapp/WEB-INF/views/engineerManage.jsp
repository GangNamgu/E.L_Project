<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="include/essential.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원관리 페이지입니다.</title>
<style type="text/css">
	form{
		padding: 12px;
	}
</style>
<script type="text/javascript">
	function engineerManage_btn_alterClick(){
		location.href="engineerManage_btn_alterClick.do";
	}
	function engineerManage_btn_deleteClick(){
		location.href="engineerManage_btn_deleteClick.do";
	}
</script>
</head>
<body>
	<form action="manager/Click_engineerManage_btn_alter.do">
		<%@include file="include/header.jsp"%>
		<input type="button" name="engineerManage_btn_alter" value="수정" onclick="engineerManage_btn_alterClick()">
		<input type="button" name="engineerManage_btn_delete" value="삭제" onclick="engineerManage_btn_deleteClick()">
	</form>
</body>
</html>