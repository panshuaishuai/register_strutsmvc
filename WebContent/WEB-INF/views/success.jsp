<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册成功</title>
</head>
<body>
	<h1>用户注册信息</h1>
	<hr>
	注册成功：
	<br> 用户名称：${user.username }
	<br> 登录密码：${user.password }
	<br> 重复密码：${user.affirmPassword }
	<br> 电子邮箱：${user.email }
	<br> 性别：${user.sex }
	<br> 职业：${user.profession }
	<br> 爱好：${user.hobby }
	<br>
	<h1>
		<a href="loginAction">去登陆</a>
	</h1>
</body>
</html>