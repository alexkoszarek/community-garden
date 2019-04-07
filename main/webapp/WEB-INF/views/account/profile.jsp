<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<h1><c:out value="${account.accountName}" /></h1>
	<br/>
	<c:out value="${account.email}" /><br/>
	<c:out value="${account.addressLine1}" /><br/>
	<c:out value="${account.addressLine2}" /><br/>
	<c:out value="${account.city}" /><br/>
	<c:out value="${account.state}" /><br/>
	<c:out value="${account.zipcode}" /><br/>
	<c:out value="${account.bio}" /><br/>
</body>
</html>