<%-- 
    Document   : CreateProduct.jsp
    Created on : 02-Nov-2017, 10:45:53
    Author     : Joseph
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Product Record</title>
    </head>
    <body>

    <h1>Create a Product record</h1>
    <form id="createProductForm" action="CreateProduct" method="post">
    <table>
        <tr><td>Make</td><td><input type="text" id = "make" name="make" /></td></tr>
        <tr><td>Weight</td><td><input type="text" id = "weight" name="weight" /></td></tr>
        <tr><td>Price</td><td><input type="text" id = "price" name="price" /></td></tr>
       <tr><td>BatteryLife</td><td><input type="text" id = "batteryLife" name="batteryLife" /></td></tr>
       <tr><td>quantity</td><td><input type="text" id = "quantity" name="quantity" /></td></tr>
       
   </table>
    <input type="submit" id="CreateRecord" value="CreateRecord" />
    </form>
<a href="ListWatches"><strong>Go to List of products</strong></a>
</body>
</html>
