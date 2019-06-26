<%-- 
    Document   : estadoPago
    Created on : Jun 25, 2019, 11:44:21 PM
    Author     : mjara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body
        <c:if test="${nombre_proyecto!=null}">
            <h1>lo toma</h1>
        </c:if>
        <c:if test="${nombre_proyecto==null}">
            <h1>no lo toma</h1>
        </c:if>
        <c:out value="${nombre_proyecto}"></c:out>
        <h1>${nombresito}</h1>
    </body>
</html>
