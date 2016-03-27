<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Add Form</title></head>
<body>

<form action="add" method="get">
    дата, продавец, покупатель, книга, количество, сумма
    <input type="text" name="date">
    <input type="number" name="shopid">
    <input type="number" name="clientid">
    <input type="text" name="book">
    <input type="number" name="count">
    <input type="number" name="cost">
    <input type="submit" value="Add">
</form>

</body>
</html>