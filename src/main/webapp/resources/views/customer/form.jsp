<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customers</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href=<c:url value="../../css/style.css"/>>
<%--<link rel="stylesheet" href="../../css/style.css">--%>
    <link rel="stylesheet" href="../../../resources/css/style.css">
</head>
<body>
<h1>Add customer</h1>
<form:form action="customer/add" commandName="customer" method="post">
    <table>
        <tr>
            <%--<td><label for="name">name:</label></td>--%>
            <%--<td><form:input path="customer.name"/></td>--%>
        </tr>
        <tr>
            <td><input type="submit" value="save"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>