<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome to the Adlister!</h1>
    </div>

<%-- todo 1. recieve all from listadsdao --%>



    <div class="list-group">
        <c:forEach items="${all}" var="ads">
            <a href="/ads/show?id=${ad.id}" class="list-group-item list-group-item-action">
                <strong>${ad.title} - ${ad.description}</strong>
            </a>
        </c:forEach>
    </div>
<%-- todo 2. loop through all the ads and display ea one --%>


</body>
</html>
