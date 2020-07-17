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
    <title>Index: Show All</title>
</head>
<body>
<div class="list-group">
    <c:forEach items="${all}" var="ad">
        <p>${ad.title} - ${ad.description}</p>
    </c:forEach>
</div>
</body>
</html>
