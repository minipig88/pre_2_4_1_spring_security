<%--
  Created by IntelliJ IDEA.
  User: klvdo
  Date: 21.05.2020
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Admin page</title>
</head>
<body>
<jsp:include page="logout.jsp" />
<div>
    <table border="1" cellpadding="5">
        <thead>
        <tr>
            <th>ID</th>
            <th>UserName</th>
            <th>Password</th>
            <th>Roles</th>
            <th>Action</th>
        </tr>
        </thead>
        <c:forEach items="${allUsers}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>
                    <c:forEach items="${user.roles}" var="role">${role.name}; </c:forEach>
                </td>
                <td>
                    <form action="${pageContext.request.contextPath}/admin/delete" method="post">
                        <input type="hidden" name="userId" value="${user.id}"/>
                        <input type="hidden" name="action" value="delete"/>
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="/">Home page</a>
</div>
</body>
</html>
