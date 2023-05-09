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
<div class="w-75 mx-auto mt-3">
<h1>All Dojos</h1>
<table class="table table-striped">
  <thead>
    <tr>
      <th>Name</th>
    
      
      
    </tr>
  </thead>
  <tbody>
 
  
    <c:forEach var="dj" items="${allDojo}">
      <tr>
        <td><c:out value="${dj.name}"/></td>
       
       <!--edit -->
<%--             <td> <a href="/burger/${br.id}/edit">Edit</a></td> --%>
<!--             Delete -->
<%--            <td><form action="/burger/${br.id}" method="post"> --%>
<!--            <input type="hidden" name="_method" value="delete"> -->
<!--            <input type="submit" value="Delete"> -->
<%--            </form></td> --%>
            
            
        
      </tr> 
    </c:forEach>
  </tbody>
</table>
 </div>
</body>
</html>