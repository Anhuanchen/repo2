<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 87266
  Date: 2019/6/16
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
        <body>
                <table>
                    <th>id</th>
                    <th>name</th>
                    <th>price</th>
                    <th>pic</th>
                    <th>createtime</th>
                    <th>detail</th>

                    <c:forEach items="users" var="user">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.price}</td>
                            <td>${user.pic}</td>
                            <td>${user.createtime}</td>
                            <td>${user.detail}</td>
                        </tr>
                    </c:forEach>
                </table>
        </body>
</html>
