<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<%@include file="include/essential.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>차량 관리 페이지입니다.</title>
<script type="text/javascript">
	function carManage_btn_insertClick(){
		location.href="../car/carManage_btn_insertClick.do";
	}
	function carManage_btn_alterClick(){
		location.href="../car/carManage_btn_alterClick.do";
	}
	function carManage_btn_deleteClick(){
		location.href="../car/carManage_btn_deleteClick.do";
	}
</script>
</head>
<body>
	<%@include file="include/header.jsp"%>
	<input type="button" name="carManage_btn_insert" value="추가" onclick="carManage_btn_insertClick()">
	<input type="button" name="carManage_btn_alter" value="수정" onclick="carManage_btn_alterClick()">
	<input type="button" name="carManage_btn_delete" value="삭제" onclick="carManage_btn_deleteClick()">
</body>
</html>