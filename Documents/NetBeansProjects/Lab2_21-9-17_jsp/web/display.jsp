<%-- 
    Document   : display
    Created on : 21-Sep-2017, 10:58:12
    Author     : Joseph
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fancy Title</title>
    </head>
    <body>
        
        <p>Email so far provided : </p>
        
        <c:forEach var ="pro" items="${emailList}">
            ${pro}  
        </c:forEach>
         <h1>

            <a href="DistributionServlet">
                Get the Distribution Path </a>
        </h1>
     
                 <h1>
            <a href="addUser.html">
                Get Email 
            
            </a>
                     
                 
        </h1>
    </body>
</html>
