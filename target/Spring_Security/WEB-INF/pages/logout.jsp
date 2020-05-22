<%--
  Created by IntelliJ IDEA.
  User: klvdo
  Date: 22.05.2020
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<sec:authorize access="isAuthenticated()">
   <p><h4><a href="/logout">Logout</a></h4></p>
</sec:authorize>
