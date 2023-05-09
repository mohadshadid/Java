<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<div class="container">
  <div class="row">
    <div class="col-md-6">
      <p><a href="/songs/new" class="btn btn-primary">Add New Song</a></p>
    </div>
    <div class="col-md-6">
      <form class="d-flex" action="dashboard" method="post">
        <input class="form-control me-2" type="search" name="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</div>
<div class="w-75 mx-auto mt-3">
<table class="table table-striped">
  <thead>
    <tr>
      <th>Name</th>
      <th>Rating</th>
      <th>Action</th>
      
      
    </tr>
  </thead>
  <tbody>
 
  
    <c:forEach var="song" items="${allSong}">
      <tr>
        <td><a href="/song/${song.id}"><c:out value="${song.title}"/></a></td>
        <td>${song.rating}</td>
        
	<td><form action="/song/${song.id}" method="post">
       <input type="hidden" name="_method" value="delete">
       <input type="submit" value="Delete">
     </form></td>
     
     
     
	<td><form action="/song/${song.id}/edit" method="Get">
       <input type="submit" value="edit">
     </form></td>

        

 
       <!--edit -->
            
<!--             Delete -->
<%--            <td><form action="/burger/${br.id}" method="post"> --%>
<!--            <input type="hidden" name="_method" value="delete"> -->
<!--            <input type="submit" value="Delete"> -->
           </form></td>
           
      </tr> 
    </c:forEach>
  </tbody>
</table>
 </div>
</body>
</html>