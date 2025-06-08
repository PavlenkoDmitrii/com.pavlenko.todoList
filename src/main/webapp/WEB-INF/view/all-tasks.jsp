<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tasks</title>
</head>
<body>
<h1>All tasks</h1>
<br>
<table>
    <tr>
        <th>ID</th>
        <th>Description</th>
        <th>Status</th>
    </tr>
    <c:forEach items="${tasks}" var="task" varStatus="loop">
        <tr>
            <td>${task.id}</td>
            <td>${task.description}</td>
            <td>${task.status}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
