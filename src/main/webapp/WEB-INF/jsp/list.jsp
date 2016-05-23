<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User list</title>
</head>
<body>
<div>
    <h3>user list info</h3>
    <div>users:${users}</div>
    <table>
        <thead>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>age</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>
                    <c:out value="${user.id}"/>
                </td>
                <td>
                    <c:out value="${user.name}"/>
                </td>
                <td>
                    <c:out value="${user.age}"/>
                </td>
                <td>
                    <table>
                        <c:forEach items="${roleMap[user.id]}" var="role">
                            <tr>
                                <td><c:out value="${role.id}"/></td>
                                <td><c:out value="${role.name}"/></td>
                            </tr>
                        </c:forEach>
                    </table>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
