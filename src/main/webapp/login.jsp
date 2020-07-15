<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: georgewilliams
  Date: 7/15/20
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
    String username = "admin";
    String password = "password";
//    Boolean username;
%>

<html>
<head>
    <title>Login</title>
</head>
<body>

<%@ include file="partials/navbar.jsp"%>
    <h1>Login:</h1>
    <form action="/login.jsp" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" placeholder="Username">
        <label for="password">Password:</label>
        <input type="text" id="password" placeholder="Password">
        <button type="submit">Login</button>
    </form>

<%--Inside of login.jsp write some code to check the submmitted values.
If the username submitted is "admin", and the password is "password",
redirect the user to the profile page; otherwise, redirect back to the login form.--%>


    <c:if test="${username == admin and password == password}">
<%--        <% response.sendRedirect("/profile.jsp"); %>--%>
    </c:if>

    <c:choose>
        <c:when test="">

        </c:when>
    </c:choose>

<%--    <c:if test="${username = null and password = null}">--%>
<%--        <% response.sendRedirect("/login.jsp"); %>--%>

<%--    </c:if>--%>


<%--    <%= request.getParameter("username")%>--%>


</body>
</html>
