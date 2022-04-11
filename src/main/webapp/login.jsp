<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
<style type="text/css">
div {
	margin: 0 auto;
	width: 80%;
	text-align: center;
	border: 1px solid;
}

.text {
	width: 150px;
	height: 20px;
}

.button {
	width: 200px;
	height: 30px;
}
</style>
</head>

<body>
	<div>
		<s:form action="userAction_login" method="post" validate="true">
			<h1>用 户 信 息 管 理 系 统</h1>
			<p>
				账号：<input type="text" name="userid" class="text"/>
			</p>
			<p>
				密码：<input type="password" name="password" class="text"/>
			</p>
			<br>
			<p>
				<button type="submit" class="button">立即登录</button>
			</p>
			<p><a href="register.jsp">快速注册</a></p>
		</s:form>
	</div>
</body>
</html>