<%-- 
    Document   : getCustomerDetails
    Created on : 05-Oct-2017, 10:35:48
    Author     : Joseph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    
    <body>
    <table>
    <tbody>
    <c:forEach var="c" items="${Customers}">
    
        <p>         Customer Number:   <tr>${c.customerNumber}</tr>         </p>
          <p>               Name: <tr>${c.customerName}</tr> </p>
          <p>                 Contact Last Name:  <tr>${c.contactLastName}</tr> </p>
          <p>                Contact First Name:   <tr>${c.contactFirstName}</tr> </p>
          <p>                Phone:    <tr>${c.phone}</tr> </p>
          <p>               Address Line 1: <tr>${c.addressLine1}</tr> </p>
          <p>                  Address Line 2:  <tr>${c.addressLine2}</tr> </p>
          <p>                   City: <tr>${c.city}</tr> </p>
          <p>              State: <tr>${c.state}</tr> </p>
                       <p>                 Credit Limit: <tr>${c.creditLimit}</tr> </p> </p>
    
    </c:forEach>
    
        
    </tbody>
   </table> 
</body>
</html>
