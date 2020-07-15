<%--
  Created by IntelliJ IDEA.
  User: georgewilliams
  Date: 7/15/20
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h1>Login:</h1>
    <form action="/login.jsp" method="post">
<%--        <label for="username">Username:</label>--%>
        <input type="text" id="username" placeholder="username">

<%--        <label for="password">Password:</label>--%>
        <input type="text" id="password" placeholder="password">

        <button type="submit">Login</button>
    </form>

<%--Inside of login.jsp write some code to check the submmitted values.
If the username submitted is "admin", and the password is "password",
redirect the user to the profile page; otherwise, redirect back to the login form.--%>

<%--if statement for username if true--%>
    <c:if test="${username}">
        <%@ include file="profile.jsp" %>
    </c:if>
<%--password will be--%>
    <c:if test="${password == password}">
        <%@ include file="profile.jsp" %>
    </c:if>


</body>
</html>
