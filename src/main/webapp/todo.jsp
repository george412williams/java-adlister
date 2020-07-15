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
<% request.setAttribute("myTasks", new String[] {"Todo 1", "Todo 2", "Todo 3"}); %>
<html>
<head>
    <%@ include file="partials/navbar.jsp"%>

    <title>To Do</title>
</head>
<body>
    <h1>Welcome!</h1>

    <%-- using JSTL   --%>
    <c:choose>

        <c:when test="${isAdmin}">
            <p>you are view this as admin</p>
<%--            use this when including a file to dynamically change based on here:--%>
<%--            <%@ include file="partials/admin-nav.jsp"%>--%>
        </c:when>
        <c:otherwise>
                <p>Move along...</p>
        </c:otherwise>

    </c:choose>

    <h1>Here are your to dos:</h1>
    <%--How do you get teh info to post here?--%>
    <p><%= request.getParameter("item")%></p>
    <p><%= request.getMethod()%></p>

    <c:if test="${isAdmin}">

    </c:if>

    <ul>
        <c:forEach items="${myTasks}" var="task">
            <li>${task}</li>
        </c:forEach>
<%--        when redeployed should look like--%>
    </ul>

</body>
</html>
