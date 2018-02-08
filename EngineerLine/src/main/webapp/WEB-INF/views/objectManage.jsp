<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<%@include file="include/essential.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방문목적 관리 페이지입니다.</title>
<script type="text/javascript">
	function objectManage_btn_insertClick(){
		location.href="../object/objectManage_btn_insertClick.do";
	}
	function objectManage_btn_alterClick(){
		location.href="../object/objectManage_btn_alterClick.do";
	}
	function objectManage_btn_deleteClick(){
		location.href="../object/objectManage_btn_deleteClick.do";
	}
</script>
</head>
<body>
	<%@include file="include/header.jsp"%>
	<input type="button" name="objectManage_btn_insert" value="추가" onclick="objectManage_btn_insertClick()">
	<input type="button" name="objectManage_btn_alter" value="수정" onclick="objectManage_btn_alterClick()">
</body>
</html>