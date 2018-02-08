<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<%@include file="include/essential.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>엔지니어 등록 페이지입니다.</title>
<script type="text/javascript">
	
</script>
<style>
	#objects{	/* 오브젝트 전체 감싸는 p */
		width: 100%;
		height: 100%;
		padding: 100px 0px;
	}
	.input{	/* input text들(name, password) */
		width: 100%;
		height: 40px;
		margin-top: 15px;
		margin-bottom: 15px;
		text-align: center;
	}
	#signup_select_team{ /* 팀 선택 셀렉트박스 */
		width: 100%;
		height: 40px;
		text-align: center;
	}
	#signup_btn{ /* 회원가입 버튼 */
		width: 100%;
		height: 40px;
		margin-top: 40px;
		margin-bottom: 10px;
	}
</style>
</head>
<body>
	<%@include file="include/header_login.jsp" %>
	<div class="container">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<p id="objects">
				<input type="text" name="signup_input_name" class="input"><br>
				<input type="password" name="signup_input_password" class="input"><br>
				<select name="signup_select_team" id="signup_select_team">
					<option value="1팀">1팀</option>
					<option value="2팀">2팀</option>
					<option value="3팀">3팀</option>
					<option value="4팀">4팀</option>
				</select><br>
				<input type="button" name="signup_btn" value="SIGN UP" id="signup_btn">
			</p>
		</div>
		<div class="col-md-2"></div>
	</div>
</body>
</html>