<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>save/update employee</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/css/style.css">
</head>
<body>
<h1>save or update employee</h1>
<form:form action="add" commandName="employee" method="post">
    <div class="form-group">
        <label for="name">name:</label><br>
        <form:input path="name"/>
    </div>
    <div class="form-group">
        <label for="salary">salary:</label><br>
        <form:input path="salary"/>
    </div>
    <div class="form-group">
        <label for="department.name">department name:</label><br>
        <form:input path="department.name"/>
    </div>
    <div class="form-group">
        <input class="btn btn-default" type="submit" value="save"/>
    </div>
</form:form>
</body>
</html>