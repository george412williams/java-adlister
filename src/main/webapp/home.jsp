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
    String note = "This is not good separation of concerns/ mixing logic and presentation is bad practice";
%>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="mine" />
    </jsp:include>
</head>
<body>


    <%--use include directive for nav and footer--%>
    <%@ include file="partials/navbar.jsp"%>

    <%--get a greeting says hello, user/ an actual name--%>
    <h1><%=note%>></h1>
    <h1>Hello, <%= firstName %> <%= lastName %></h1>

    <%--create an aboutme.jsp file in partials and include in home.jsp--%>
    <%@ include file="partials/aboutme.jsp"%>

<%--    <%--%>
<%--    if (firstName != null){--%>
<%--        if (firstName.equals("George")){--%>
<%--            response.sendRedirect("/index.jsp");--%>
<%--        }--%>
<%--    }--%>
<%--    %>--%>

    <h1>Welcome To The Site!</h1>
    <p>Path: <%= request.getRequestURL() %></p>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>"name" parameter: <%= request.getParameter("name") %></p>
    <p>"method" attribute: <%= request.getMethod() %></p>
    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>

    <h3>What would you like to do?</h3>

    <h3>view your profile</h3>
    <form action="/user-profile.jsp" method="get">
        <input type="hidden" id="username" name="username">
        <button type="submit">Go There</button>
    </form>

    <h3>Add a To Do</h3>
    <form action="/todo.jsp" method="post">
        <input type="text" id="item" name="item">
        <button type="submit">Submit</button>
    </form>

    <h3>this button is for what?</h3>
    <form action="/home.jsp" method="post">
        <button type="submit">Submit</button>
    </form>

        <%--login page part of exercise, if login as admin w pw redirected to admin page,
        in real life, something has to check if that is correct, don't want  to send pw
        to another jsp, just want to check it, servlets do that--%>



    <%@ include file="partials/footer.jsp"%>

</body>
</html>
