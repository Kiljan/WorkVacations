<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
<title>Istniejący Użytkownik</title>
</head>
<body background="<spring:url value="/images/wacation.jpg"/>">
<security:authorize access="hasRole('ADMIN')">

<form:form action="/UrlopyApp/adminMain" method="get" >
<h1>Użytkownik jakiego próbowano dodać już istnieje !!</h1>
<input type="submit" value="Wróć do strony głównej" />
</form:form>


</security:authorize>
</body>
</html>