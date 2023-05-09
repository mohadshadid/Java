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
<title>Save Travels</title>
 <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div><h1>All Travels</h1>
<table>
    <thead>
        <tr>
            
            <th>Expenses Name</th>
            <th> Vendor</th>
            <th>Amount</th>
            <th>Action</th>
            
        </tr>
    </thead>
    <tbody>
         <c:forEach var="t" items="${ts}">
          <tr>
          
          
          <th><a href="/show/${t.id}"><c:out value="${t.name}"/></a></th>
          <th><c:out value="${t.vendor}"/></th>
          <th><c:out value="${t.amount}"/></th>
          <th><a href="/edit/${t.id }">Edit | </a><a href="/delete/${t.id }"> Delete</a> </th>
          
        
   </c:forEach>
    </tr>
    </tbody>
</table>
</div>
<div>
<h2>Add An Expenses : </h2>
<form:form action="/addtravel" method="post" modelAttribute="travel">
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
</div>
</body>
</html>