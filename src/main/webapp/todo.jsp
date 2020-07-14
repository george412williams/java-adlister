<%--
  Created by IntelliJ IDEA.
  User: georgewilliams
  Date: 7/14/20
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Do</title>
</head>
<body>

<h1>Here are your to dos:</h1>
<%--How do you get teh info to post here?--%>
<p><%= request.getParameter("item")%></p>
<p><%= request.getMethod()%></p>

</body>
</html>
