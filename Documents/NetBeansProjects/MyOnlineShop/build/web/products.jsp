<%-- 
    Document   : products
    Created on : 26-Oct-2017, 10:44:04
    Author     : Joseph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Of Products</title>
        <LINK REL="stylesheet" HREF="css/myshop.css" TYPE="text/css">
    </head>
    <body>

    <h1>List of Products</h1>
    
    
    
<table id="productTable" border="3">
<tr >
    <th>Make</th>
    <th>Weight( grams)</th>
    <th>Price(euros)</th>
    <th>Battery life ( years)</th>
    <th>Quantity</th>
</tr>
<c:forEach var="product" begin="0" items="${requestScope.productsList}">
<tr>
    <td>${product.make}&nbsp;&nbsp;</td> 
    <td>${product.weight}&nbsp;&nbsp;</td> 
    <td>${product.price}&nbsp;&nbsp;</td> 
    <td>${product.batteryLife}&nbsp;&nbsp;</td> 
     <td>${product.quantity}&nbsp;&nbsp;</td> 
     
     <td>
                                    <form method="post" action="editProduct.jsp">
                                        <input type="hidden"  name="make" value="${product.make}"/> 
                                        <input type="hidden"  name="weight" value="${product.weight}"/> 
                                        <input type="hidden"  name="price" value="${product.price}"/> 
                                         <input type="hidden"  name="batteryLife" value="${product.batteryLife}"/> 
                                        <input type="hidden"  name="quantity" value="${product.quantity}"/> 
                                       
                                        <input type="submit" value="Edit"/> 
                                    </form>
     
     </td>
     <td><form method="post" action="deleteProduct">
                                        <input type="hidden"  name="make" value="${product.make}"/> 
                                        <input type="submit" value="Delete"/> 
                                    </form></td>
                                    
                                    
                                    
     
     
</tr> 

</c:forEach>

</table>

  <a href="CreateProduct.jsp"><strong>Create a Product Record</strong></a>
                        
</body>
</html>
