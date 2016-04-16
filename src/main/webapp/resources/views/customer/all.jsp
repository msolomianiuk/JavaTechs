<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customers</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/css/style.css">

</head>
<body>
<h1>Customers</h1>
<table id="table">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>project name</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.project.name}</td>
            <td><button id="ref" class="btn-default">X</button></td>
            <script type="text/javascript">
                var ref = $('#ref');
                ref.on('click', function () {
                    $.ajax({
                        type: 'DELETE',
                        url: "${pageContext.request.contextPath}/customer/delete?id=${customer.id}"})
                });
            </script>
        </tr>
    </c:forEach>
    <tr>
        <td><a href="${pageContext.request.contextPath}/customer/form">+</a></td>
    </tr>
</table>
</body>
</html>