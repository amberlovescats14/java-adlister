<%--
  Created by IntelliJ IDEA.
  User: amberjones
  Date: 1/7/20
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<nav>
<%--    <%@ include file="partials/nav.jsp" %>--%>
    <c:import url="partials/nav.jsp"/>
</nav>
<header>
<%--    <%@ include file="partials/banner.jsp"%>--%>
    <c:import url="partials/banner.jsp"/>
</header>
<div class="row">
<form method="post" action="/login.jsp" class="col s6">
    <label for="username">
        Username:
        <input type="text" name="username" id="username">
    </label>
    <label for="password">
        Password:
        <input type="text" name="password" id="password">
    </label>
    <input type="submit">
</form>
</div>

<c:if test="${param.username.toLowerCase() eq 'admin'}">
    <c:if test="${param.password.toLowerCase() eq 'password'}">
        <c:redirect url="/profile.jsp"/>
    </c:if>
</c:if>



</body>
</html>
