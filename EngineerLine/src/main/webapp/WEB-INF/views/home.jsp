<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@include file="include/essential.jsp"%>
<html>
<head>
	<title>Home</title>
</head>

<body>
<h1>
	Hello world!  
</h1>

<P>  세상 안녕! The time on the server is ${serverTime}. </P>
<input type="button" name="btn" value="버튼" onClick="hello.do">
</body>

</html>
