<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="McBurgers 'R Us!" />
    </jsp:include>
</head>
<body>

<%--<% response.sendRedirect("/home.jsp"); %>--%>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
        <h1>It's Burger Time!</h1>
<%--        use bootstrap list group, he chose one w hover and removed active class--%>
<%--        list all burgers w link to their indiv pages--%>
        <div class="list-group">
            <script type="text/javascript">
                console.log("its working")
                console.log(${allBurgers})</script>
            <c:forEach items="${allBurgers}" var="burger">
                <a href="/burgers/show?id=${burger.id}" class="list-group-item list-group-item-action">
                    <strong>${burger.title}</strong> - ${burger.description}
                </a>
            </c:forEach>
        </div>
    </div>


<%--to add his scripts--%>
<%--<jsp:include page="partials/scripts.jsp" />--%>
<jsp:include page="partials/footer.jsp" />


</body>
</html>
