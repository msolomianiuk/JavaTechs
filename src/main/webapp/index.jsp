<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Main page</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href=<c:url value="resources/css/style.css"/>>
</head>
<body>
<h1>Human Resources department web system</h1>
<a href="${pageContext.request.contextPath}customer/getAll">
    <div>
        Customers
    </div>
</a>
<a href="${pageContext.request.contextPath}">
    <div>
        Projects
    </div>
</a>
<a href="${pageContext.request.contextPath}">
    <div>
        Employees
    </div>
</a>
<a href="${pageContext.request.contextPath}">
    <div>
        Departments
    </div>
</a>
<a href="${pageContext.request.contextPath}">
    <div>
        Managers
    </div>
</a>
<a href="${pageContext.request.contextPath}">
    <div>
        Teams
    </div>
</a>
<a href="${pageContext.request.contextPath}">
    <div>
        Board of Managers
    </div>
</a>
</body>
</html>