<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
<title>Witaj <security:authentication property="principal.username" /></title>
</head>
<body background="<spring:url value="/images/wacation.jpg"/>">

<security:authorize access="hasRole('ADMIN')">

	<div align="center">
		<h1>Lista wszystkich Urlopowiczów</h1>
		<form:form modelAttribute="mainView" action="/UrlopyApp/adminMain/saveAll" method="POST">
		<form:errors path="*" element="div" cssClass="errors"/>
		
			<table BORDER="1" CELLPADDING="3" CELLSPACING="1">
				<tr>
					<th bgcolor="#FFFF00">Imię</th>
					<th bgcolor="#FFFF00">Nazwisko</th>
					<th bgcolor="#FFFF00">Nazwa Użytkownika</th>
					<th bgcolor="#FFFF00">Liczba dni urlopu</th>
					<th bgcolor="#FFFF00">Urlop z tego roku</th>
					<th bgcolor="#FFFF00">Urlop z lat ubiegłych</th>
					<th bgcolor="#FFFF00">Hasło</th>
					<th bgcolor="#FFFF00">Delete</th>
				</tr>
				<c:forEach items="${mainView.work}" var="contact" varStatus="status">
					<tr>
						<td><input value="${contact.imie}" name="work[${status.index}].imie" /></td>
						<td><input value="${contact.nazwisko}" name="work[${status.index}].nazwisko"  /></td>
						<td><input value="${contact.username}" name="work[${status.index}].username"  /></td>
						<td><input value="${contact.dniUrlopu}" name="work[${status.index}].dniUrlopu"  /></td>
						<td><input value="${contact.dniUrlopuTenRok}" name="work[${status.index}].dniUrlopuTenRok"  /></td>
						<td><input value="${contact.dniUrlopuLataWstecz}" name="work[${status.index}].dniUrlopuLataWstecz"  /></td>
						<td><input value="${contact.password}" name="work[${status.index}].password"  /></td>
						<td bgcolor="#FFFF00"><a href="/UrlopyApp/adminMain/removeUser?username=${contact.username}">Usuń</a></td>

					</tr>
				</c:forEach>
			</table>
			<br />
			<input type="submit" value="Zapisz" />
		</form:form>
		<br>
		<form action=/UrlopyApp/adminMain/addNew>
			<INPUT value="Dodaj Nowego" type="submit">
		</form>
	</div>

<br>
<br>

<h6>1. Hasło urlopowicza może być puste (Administrator przejmuje pełną odpowiedzialność)</h6>
<h6>2. Dni muszą być podawane w liczbach całkowitych</h6>
<h6>3. Pola z imieniem i nazwiskiem mogą być puste. Obowiązkowa jest natomiast nazwa użytkownika</h6>
<h6>4. Nazwa użytkownika jest zablokowana do edycji. Chcąc edytować nazwę należy usunąć rekord a następnie dodać go ponownie</h6>

<c:url var="logoutUrl" value="/logout"/>
    <form:form action="${logoutUrl}"
            method="post">
    <input type="submit"
               value="Log out" />
    <input type="hidden"
                name="${_csrf.parameterName}"
                value="${_csrf.token}"/>
    </form:form>
    
</security:authorize>
</html>