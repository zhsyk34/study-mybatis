<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User list</title>
</head>
<body>
<div>
    <h3>user list info</h3>

    <table>
        <thead>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>age</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="users" var="user"></c:forEach>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
