<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>save/update manager</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/css/style.css">
</head>
<body>
<h1>save or update manager</h1>
<form:form action="add" commandName="manager" method="post">
    <div class="form-group">
        <label for="name">name:</label><br>
        <form:input path="name"/>
    </div>
    <div class="form-group">
        <label for="bonus">bonus:</label><br>
        <form:input path="bonus"/>
    </div>
    <div class="form-group">
        <label for="project.name">project name:</label><br>
        <form:input path="project.name"/>
    </div>
    <div class="form-group">
        <input class="btn btn-default" type="submit" value="save"/>
    </div>
</form:form>
</body>
</html>