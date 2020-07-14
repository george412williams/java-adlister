<%--
  Created by IntelliJ IDEA.
  User: georgewilliams
  Date: 7/14/20
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! String user = "Dan"; %>
<%!
    String firstName = "George";
    String lastName = "Willie";
    String note = "This is not good separation of concerns/ mixing logic and presentation is bad practice"
%>

<html>
<head>
    <title>Home Page</title>
</head>
<body>

    <%--use include directive for nav and footer--%>
    <%@ include file="WEB-INF/partials/navbar.jsp"%>

    <%--get a greeting says hello, user/ an actual name--%>
    <h1><%=note%>></h1>
    <h1>Hello, <%= firstName %> <%= lastName %></h1>

    <%@ include file="WEB-INF/partials/footer.jsp"%>

    <%--create an aboutme.jsp file in partials and include in home.jsp--%>
    <%@ include file="WEB-INF/partials/aboutme.jsp"%>

</body>
</html>
