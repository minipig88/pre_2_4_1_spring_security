<%--
  Created by IntelliJ IDEA.
  User: klvdo
  Date: 22.05.2020
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>
<body>
<jsp:include page="logout.jsp" />
<div>
    <h3>${pageContext.request.userPrincipal.name}</h3>
    <sec:authorize access="!isAuthenticated()">
        <h4><a href="/login">Login</a></h4>
        <h4><a href="/registration">Registration</a></h4>
    </sec:authorize>
    <h4><a href="/news">News (For only users)</a></h4>
    <h4><a href="/admin/userList">User List (For only admins)</a></h4>
</div>
</body>
</html>
