<%--
  Created by IntelliJ IDEA.
  User: michael
  Date: 29/07/16
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Customer</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../css/style.css">
</head>
<body>
<h1>Customers</h1>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>project name</th>
    </tr>
    <c:forEach var="customer" items= "${customers}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.project.name}</td>
            <td><a href="${pageContext.request.contextPath}/customers/delete?id=${customer.id}" data-method="delete">X</a></td>
        </tr>
    </c:forEach>
    <tr><td><a href="${pageContext.request.contextPath}/customers/add">+</a></td></tr>
</table>
</body>
</html>