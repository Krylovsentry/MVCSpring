<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Add Form</title></head>
<body>

<form action="/addConfirm" method="get">

    <table>
    <tr><td>Date:</td><td><input type="date" name="date"></td></tr>
    <tr><td>Shop ID:</td><td><input type="number" name="shopid"></td></tr>
    <tr><td> Client ID:</td><td><input type="number" name="clientid"></td></tr>
    <tr><td>Book:</td><td><input type="text" name="book"></td></tr>
    <tr><td>Count:</td><td><input type="number" name="count"></td></tr>
    <tr><td>Cost:</td><td><input type="number" name="cost"></td></tr>
    <tr><td><input type="submit" value="Add"></td></tr>
    </table>
</form>

</body>
</html>