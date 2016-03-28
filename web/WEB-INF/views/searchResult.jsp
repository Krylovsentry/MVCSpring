<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 28.03.2016
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Search Result's</title>
</head>
<body>
<table>

    <thead>ID</thead>
    <thead>Date</thead>
    <thead>Shop ID</thead>
    <thead>Client ID</thead>
    <thead>Book</thead>
    <thead>Cost</thead>
    <thead>Count</thead>
    
<c:forEach items="${purchases}" var = "purchase">
    <tr>
        <td>${purchase.id}</td>
        <td>${purchase.date}</td>
        <td>${purchase.shopId}</td>
        <td>${purchase.clientId}</td>
        <td>${purchase.bookId}</td>
        <td>${purchase.cost}</td>
        <td>${purchase.count}</td>
    </tr>
</c:forEach>

</table>
</body>
</html>
