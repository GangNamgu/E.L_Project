<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<%@include file="include/essential.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인페이지입니다.</title>
<script type="text/javascript">
	
</script>
<style>
	form{
		margin: 8px;
	}
	#objects{	/* 오브젝트 전체 감싸는 p */
		width: 100%;
		height: 100%;
		padding: 100px 0px;
	}
	.input{	/* input text들(name, login) */
		width: 100%;
		height: 40px;
		margin-top: 15px;
		margin-bottom: 15px;
		text-align: center;
	}
	#login_btn{ /* 로그인 버튼 */
		width: 100%;
		height: 40px;
		margin-top: 10px;
		margin-bottom: 10px;
	}
	#signupDiv{ /* SIGN UP ▶ a */
		width: 100%;
		font-size: 15px;
		text-align: center;
		margin: 0px 10px 10px 10px;
	}
</style>
</head>
<body>
	<%@include file="include/header_login.jsp" %>
	<form action="../engineer/goMain.do">
		<div class="container">
			<div class="row">
			 	<div class="col-md-2"></div>
			  	<div class="col-md-8">
				  	<p id="objects">
						<input type="text" name="login_input_name" class="input" placeholder="NAME"><br>
						<input type="password" name="login_input_password" class="input" placeholder="PASSWORD"><br>
						<input type="submit" name="login_submit" id="login_btn" value="LOGIN"><br>
						<div id="signupDiv">
							<a href="../manager/login_to_signup.do">SIGN UP▶</a>
						</div>
					</p>
			  	</div>
			  	<div class="col-md-2"></div>
			</div>
		</div>
	</form>
</body>
</html>