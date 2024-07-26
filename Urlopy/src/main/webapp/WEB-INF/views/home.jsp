<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
<title>Witaj <security:authentication property="principal.username" /></title>
</head>

<body background="<spring:url value="/images/wacation.jpg"/>">
<h1>Dni urlopu</h1>
<h2>${message}</h2>
<br>
<table class="tg" style="undefined;table-layout: fixed; width: 429px">
<colgroup>
<col style="width: 166px">
<col style="width: 101px">
<col style="width: 162px">
</colgroup>
  <tr>
    <th class="viewUrlopy">Dni urlopu</th>
    <th class="viewUrlopy">Dni z tego roku</th>
    <th class="viewUrlopy">Dni z lat ubiegłych</th>
  </tr>
  <tr>
    <td class="viewUrlopy">${workerDetails.dniUrlopu}</td>
    <td class="viewUrlopy">${workerDetails.dniUrlopuTenRok}</td>
    <td class="viewUrlopy">${workerDetails.dniUrlopuLataWstecz}</td>
  </tr>
</table>

<br>

<c:url var="logoutUrl" value="/logout"/>
    <form:form action="${logoutUrl}"
            method="post">
    <input type="submit"
               value="Log out" />
    <input type="hidden"
                name="${_csrf.parameterName}"
                value="${_csrf.token}"/>
    </form:form>

</body>
</html>