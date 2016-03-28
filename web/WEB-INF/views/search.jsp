<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 28.03.2016
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Form</title>
</head>
<body>

    <form action="/searchResult" method="get">
        <table>
    <tr><td>Shop ID:</td><td><input type="number" name="shopid" value="0"></td></tr>
    <tr><td>Client ID:</td><td><input type="number" name="clientid" value="0"></td></tr>
    <tr><td>Book:</td><td><input type="text" name="book"></td></tr>
    <tr><td><input type="submit" value="Search"></td></tr>

        </table>
    </form>

</body>
</html>
