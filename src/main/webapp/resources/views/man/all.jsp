<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Managers</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/css/style.css">

</head>
<body>
<h1>Managers</h1>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>bonus</th>
        <th>project name</th>
    </tr>
    <c:forEach var="manager" items= "${managers}">
        <tr>
            <td>${manager.id}</td>
            <td>${manager.name}</td>
            <td>${manager.bonus}</td>
            <td>${manager.project.name}</td>
            <td><a href="${pageContext.request.contextPath}/employee/manager/delete?id=${manager.id}">X</a></td>
        </tr>
    </c:forEach>
    <tr><td><a href="${pageContext.request.contextPath}/employee/manager/form">+</a></td></tr>
</table>
<br><br><br>
<a href="${pageContext.request.contextPath}/">
    <button class="btn-default">home</button>
</a>
</body>
</html>