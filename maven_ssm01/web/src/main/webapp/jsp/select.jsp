<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 87266
  Date: 2019/6/16
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="${pageContext.request.contextPath}/user/findById" >
            <input type="text" name="number">
            <input type="submit" value="输入数字查询"><br>
        </form>
        <a href="${pageContext.request.contextPath}/user/findAll">查询所有</a>
        <table border="1">
            <th>id</th>
            <th>name</th>
            <th>price</th>
            <th>pic</th>
            <th>createtime</th>
            <th>detail</th>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.price}</td>
                    <td>${user.pic}</td>
                    <td>${user.createtime}</td>
                    <td>${user.detail}</td>
                </tr>
        </table>
</body>
</html>
