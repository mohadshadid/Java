<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
 <link rel="stylesheet" href="/css/edit.css">
</head>
<body>
<div class="header"><h2>Edit An Expenses : </h2>
<p><a href="/expenses">Go Back</a> </p></div>

<form:form action="/edit/${travels.id}" method="post" modelAttribute="travels">
<input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Expenses Name : </form:label>
        <form:errors path="name" style="color:red;"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor" style="color:red;"/>
        <form:textarea path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount" style="color:red;"/>     
        <form:input type="number" path="amount"/>
    </p>  
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description" style="color:red;"/>
        <form:input path="description"/>
    </p>
      
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>