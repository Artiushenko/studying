<%@ page import="intexsoft.model.User" %>
<%@ page import="intexsoft.controller.EmployeeController" %><%--
  Created by IntelliJ IDEA.
  User: dmitry.artiushenko
  Date: 13.08.2018
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
</head>
<body>
<h2> Начальная страница</h2>

<form action="changePage">
    <!--    <input type="text" name = "t1"><br>     -->
    <!--    <input type="text" name = "userId"><br> -->
    <ul id="menu">
        <input type="text" name="id"><br>
        <input type="text" name="userId"><br>
        <input type="text" name="product_name"><br>
        <input type="text" name="product_price"><br>
        <input type="text" name="product_quantity"><br>
    </ul>
    <input type="submit" value="Волшебная кнопка"><br>
</form>
<form action="gotoHTML">
    <input type="submit" value="gotoHTML">
</form>
</body>
</html>
