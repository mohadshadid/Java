<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="/ninja/new" method="post" modelAttribute="ninja">

<form:label  class="form-label" path="dojo">dojo</form:label>
<form:select path="dojo">
        <c:forEach var="dj" items="${allDojo}">
            <!--- Each option VALUE is the id of the person --->
            <form:option value="${dj.id}" path="dojo">
            <!--- This is what shows to the user as the option --->
                <c:out value="${dj.name}"/>

            </form:option>
        </c:forEach>
    </form:select>
    <p>
        <form:label  class="form-label" path="firstName">FirstName</form:label>
        <form:errors path="firstName"/>
        <form:input class="form-control" path="firstName"/>
    </p>
    <p>
        <form:label  class="form-label" path="lastName">LastName</form:label>
        <form:errors path="lastName"/>
        <form:input class="form-control" path="lastName"/>
    </p>
    <p>
        <form:label  class="form-label" path="age">Age</form:label>
        <form:errors path="age"/>
       <form:input type="number" path="age"/>
    </p>
    
    <input class="btn btn-outline-primary" type="submit" value="Submit"/>
</form:form> 
    
 </div>
</body>
</html>