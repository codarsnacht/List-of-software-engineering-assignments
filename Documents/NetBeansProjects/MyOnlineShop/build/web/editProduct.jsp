<%-- 
    Document   : editProduct
    Created on : 09-Nov-2017, 09:44:27
    Author     : Joseph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Product</title>
    </head>
    <body>
       <h1>Edit a Product record</h1>
    <form id="createProductForm" action="editProduct" method="post">
    <table>
        <tr><td>Make</td><td><input type="text" value="${param.make}" id = "make" name="make" /></td></tr>
        <tr><td>Weight</td><td><input type="text"value="${param.weight}" id = "weight" name="weight" /></td></tr>
        <tr><td>Price</td><td><input type="text" value="${param.price}" id = "price" name="price" /></td></tr>
       <tr><td>BatteryLife</td><td><input type="text" value="${param.batteryLife}" id = "batteryLife" name="batteryLife" /></td></tr>
       <tr><td>quantity</td><td><input type="text" value="${param.quantity}" id = "quantity" name="quantity" /></td></tr>
       
   </table>
    <input type="submit" id="editRecord" value="editRecord" />
    </form>
<a href="ListWatches"><strong>Go to List of products</strong></a>
    </body>
</html>
