<%--
  Created by IntelliJ IDEA.
  User: georgewilliams
  Date: 7/14/20
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("isAdmin", true); %>
<html>
<head>
    <title>To Do</title>
</head>
<body>
    <h1>Welcome!</h1>

    <%-- using JSTL   --%>
    <c:choose>

        <c:when test="${isAdmin}">
            <p>you are view this as admin</p>
        </c:when>
        <c:otherwise>
                <p>Move along...</p>
        </c:otherwise>

    </c:choose>

    <h1>Here are your to dos:</h1>
    <%--How do you get teh info to post here?--%>
    <p><%= request.getParameter("item")%></p>
    <p><%= request.getMethod()%></p>

</body>
</html>
