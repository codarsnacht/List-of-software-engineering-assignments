<%-- 
    Document   : custView
    Created on : 28-Sep-2017, 10:46:46
    Author     : Joseph
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display details</title>
        </head>
        <body>

    <table>
        <thead>
            <tr>
              <th>Details</th>  <th>CustomerID</th> <th>Name</th> <th>City</th> <th>CreditLimit</th>
         </tr>
    </thead>
    <tbody>
           <td>
                            <form method="post" action="getCustomerDetails.jsp">
                                  <input type="submit" value="Details"/>  
                            </form>
                            </td>
        <c:forEach var="c" items="${Customers}">
         
                
                      <td>${c.customerNumber}</td>
                        <td>${c.customerName}</td>
                            <td>${c.city}</td>
                            <td>${c.creditLimit}</td>
                    
                       
                    
     </c:forEach>
    </tbody>
   </table> 
</body>
</html>
