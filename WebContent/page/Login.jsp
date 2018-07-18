<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h6>${MESSAGE}</h6>
	<s:form action="login.action">
		用户名:<s:textfield name="username"></s:textfield>
		密码:<s:password name="pwd"></s:password>
		<s:submit value="登录" />
	</s:form>
</body>
</html>