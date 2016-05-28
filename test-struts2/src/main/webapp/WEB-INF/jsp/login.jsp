<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<h1>login:</h1>
	<s:form action="login">
		<s:textfield name="userName" label="用户名" key="user"></s:textfield>
		<s:password name="passWord" label="密码" key="password"></s:password>
		<s:submit key="login" value="提交"></s:submit>
	</s:form>
</body>
</html>