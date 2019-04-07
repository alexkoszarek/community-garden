<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- Imports -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<style type="text/css">
		label.error {
			color: #b30000;
\		}
		div.error {
			color: black;
			border: 2px solid red;
			background-color: #ffb3b3
		}
	</style>
	<title>Register a New Account</title>
</head>
<body>
	<h1>Account Details</h1>
	
	<sf:form method="POST" commandName="account" >
	<sf:errors path="*" element="div" cssClass="error" />
		<sf:label path="accountName" cssErrorClass="error">Username</sf:label>:
		<sf:input path="accountName" cssErrorClass="error" /><br/>

		<sf:label path="password" cssErrorClass="error">Password</sf:label>:
		<sf:password path="password" cssErrorClass="error" /><br/>
		
		<sf:label path="email" cssErrorClass="error">Email</sf:label>:
		<sf:input path="email" type="email" cssErrorClass="error" /><br/>
		
		<sf:label path="addressLine1" cssErrorClass="error">Address</sf:label>:
		<sf:input path="addressLine1" cssErrorClass="error" /><br/>
		
		<sf:label path="addressLine2" cssErrorClass="error" />
		<sf:input path="addressLine2" cssErrorClass="error" /><br/>
		
		<sf:label path="city" cssErrorClass="error" >City</sf:label>:
		<sf:input path="city" cssErrorClass="error" /><br/>
		
		<sf:label path="state" cssErrorClass="error" >State</sf:label>:
		<sf:input path="state" cssErrorClass="error" /><br/>
		
		<sf:label path="zipcode" cssErrorClass="error" >Zipcode</sf:label>:
		<sf:input path="zipcode" cssErrorClass="error" /><br/>
		
		<sf:label path="bio" cssErrorClass="error" >Bio</sf:label>:
		<sf:input path="bio" cssErrorClass="error" /><br/>
		
		<input type="submit" values="Register" />		
	</sf:form>
</body>
</html>