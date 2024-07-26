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
<title>Nowy Urlopowicz</title>
</head>
<body background="<spring:url value="/images/wacation.jpg"/>">

<security:authorize access="hasRole('ADMIN')">
    <div align="center">
        <h1>Dodaj nowego Urlopowicza</h1>
        <form:form modelAttribute="worker" action="/UrlopyApp/adminMain/saveNew" method="post" >
        <!--<form:errors path="*" element="div" cssClass="errors" />-->
    
        <table>
            <form:hidden path="id"/>
            <tr>
                <td><font color="#FFFF00">Imię</font></td>
                <td><form:input path="imie" cssErrorClass="error"/></td>
                <td><form:errors path="imie" element="div" cssClass="errors"/></td>
            </tr>
            <tr>
                <td><font color="#FFFF00">Nazwisko</font></td>
                <td><form:input path="nazwisko" cssErrorClass="error"/></td>
                <td><form:errors path="nazwisko" element="div" cssClass="errors"/></td>
            </tr>
            <tr>
                <td><font color="#FFFF00">Username</font></td>
                <td><form:input path="username" cssErrorClass="error"/></td>
                <td><form:errors path="username" element="div" cssClass="errors"/></td>
            </tr>
            <tr>
                <td><font color="#FFFF00">Password</font></td>
                <td><form:input path="password" cssErrorClass="error"/></td>
                <td><form:errors path="password" element="div" cssClass="errors"/></td>
            </tr>
            <tr>
                <td><font color="#FFFF00">Rola</font></td>
                <td><form:input path="role" cssErrorClass="error"/></td>
                <td><form:errors path="role" element="div" cssClass="errors"/></td>
            </tr>
            <tr>
                <td><font color="#FFFF00">Dni Urlopu</font></td>
                <td><form:input path="dniUrlopu" cssErrorClass="error"/></td>
                <td><form:errors path="dniUrlopu" element="div" cssClass="errors"/></td>
            </tr>
            <tr>
                <td><font color="#FFFF00">Dni Urlopu Ten Rok</font></td>
                <td><form:input path="dniUrlopuTenRok" cssErrorClass="error"/></td>
                <td><form:errors path="dniUrlopuTenRok" element="div" cssClass="errors"/></td>
            </tr>
            <tr>
                <td><font color="#FFFF00">Dni Urlopu Lata Wstecz</font></td>
                <td><form:input path="dniUrlopuLataWstecz" cssErrorClass="error"/></td>
                <td><form:errors path="dniUrlopuLataWstecz" element="div" cssClass="errors"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Zapisz"></td>
            </tr>
        </table>
        </form:form>
        
        <form action=/UrlopyApp/adminMain>
			<INPUT value="Powrót do strony głównej" type="submit">
		</form>
    </div>
    
<br>
<br>

<h6>1. Hasło urlopowicza może być puste (Administrator przejmuje pełną odpowiedzialność)</h6>
<h6>2. Dni muszą być podawane w liczbach całkowitych</h6>
<h6>3. Pola z imieniem i nazwiskiem mogą być puste. Obowiązkowa jest natomiast nazwa użytkownika</h6>
<h6>4. Nazwa użytkownika jest zablokowana do edycji. Chcąc edytować nazwę należy usunąć rekord a następnie dodać go ponownie</h6>
    
</security:authorize>
</body>
</html>