<%--
  Created by IntelliJ IDEA.
  User: georgewilliams
  Date: 7/16/20
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
    <title>Index: Show All</title>
    <jsp:include page="../partials/navbar.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
        <h1>All Ads</h1>
<div class="container list-group">
    <c:forEach items="${all}" var="ad">
        <strong>${ad.title}</strong>
        <p>${ad.description}</p>
    </c:forEach>
</div>
</body>
</html>
