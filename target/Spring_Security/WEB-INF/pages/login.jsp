<%--
  Created by IntelliJ IDEA.
  User: Святослав
  Date: 25.11.2019
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
</head>
<body>
<div style="right: auto">
<jsp:include page="logout.jsp" />
</div>
<sec:authorize access="isAuthenticated()">
    <% response.sendRedirect("/"); %>
</sec:authorize>
<form method="post" action="/login">
    <div>
        <h2>Log in with your account</h2>
        <input name="j_username" type="text" placeholder="Username" autofocus="true"/>
        <input name="j_password" type="password" placeholder="Password"/>
        <button type="submit">Log In</button>
        <h4><a href="/registration">Go to registration</a></h4>
    </div>
</form>
</body>
</html>
