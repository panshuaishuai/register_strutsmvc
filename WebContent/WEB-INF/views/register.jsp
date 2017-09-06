<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="container">
		<h1>
			<header> <img src="images/logo.png"> 用户注册</header>
		</h1>
		<form action="registerResult" method="post" onsubmit="return registers(this)">
			用户名称： <input type="text" name="user.username" placeholder="请输入您的用户名！"
				size="40" minlength="1" maxlength="20" required autofocus><span></span>
			<br> <br>
			登录密码： <input id="one" type="password"
				name="user.password" placeholder="请输入您的密码！" size="40" minlength="6"
				maxlength="20" required><span></span> <br> <br>
			重复密码： <input id="two" type="password" name="user.affirmPassword"
				placeholder="请确认您的密码！" size="40" minlength="6" maxlength="20"
				required><span></span> <br> <br>
			电子邮箱： <input type="email" name="user.email" placeholder="请输入您的邮箱！" size="40" required><span></span>
			<br> <br>
			<span class="sex">性 别： <input type="radio" name="user.sex" value="男" checked>男 
				<input type="radio" name="user.sex" value="女">女
			</span> <br> <br> 
			<span id="span">职 业： <select style="width: 310px" name="user.profession">
					<option>学生</option>
					<option>老师</option>
					<option>博导</option>
					<option>教授</option>
			</select> <br> <br> 
			爱 好： <select style="width: 310px" name="user.hobby" size="4" class="hobby" multiple>
					<option>编程</option>
					<option>编程</option>
					<option>编程</option>
					<option>还是编程</option>
			</select></span>
			<hr>
			<br>
			<button type="submit">注册</button>
			<button type="reset">重置</button><br>
			<font color="red">${message }</font> 
		</form>
	</div>
	<footer>Copyright&nbsp;&copy;&nbsp;2017.潘帅版权所有</footer>
	<script type="text/javascript" src="js/register.js"></script>
</body>
</html>