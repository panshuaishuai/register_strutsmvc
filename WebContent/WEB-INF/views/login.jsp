<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
	<div id="margin">
		<img class="picture" src="images/login.png">
		<div class="letterMargin">
			<img class="logo" src="images/logos.png">
			<h2>系统登录</h2>
			<hr>
			<div class="letterMargin1">
				<form method="post" action="loginResult" onsubmit="return hint()">
					<p>
						用户名： <input id="user" type="text" name="user.username"
							placeholder="请输入您的用户名！">
					</p>
					<br>
					<p>
						密&nbsp;&nbsp;&nbsp;码： <input id="pass" type="password"
							name="user.password" placeholder="请输入您的密码！">
					</p>
					<p>
						<input type="radio" name="select">记住密码
					</p>
					<br>
					<p>
						<input class="buttons" type="submit" name="login" value="登录">&nbsp;&nbsp;&nbsp;
						<input class="buttons" type="reset" name="cancel" value="重置">&nbsp;&nbsp;&nbsp;
						<input class="buttons" type="button" name="button" value="注册" onclick="hints()">
					</p>
				</form>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/login.js"></script>
</body>
</html>