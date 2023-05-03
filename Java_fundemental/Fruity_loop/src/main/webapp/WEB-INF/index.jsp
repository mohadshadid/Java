<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

<html>
<head>
<meta charset="UTF-8">
<title>Fruits Store</title>
</head>
<body>
  <h1>Fruits</h1>
    
        
        
    
<table class="table table-striped">
  <c:forEach var="x" items="${fruits}">
    <tr>
      <td><p><c:out value="${x.name}"></c:out></p></td>
      <td><p><c:out value="${x.price}"></c:out></p></td>
   </tr>
  </c:forEach>
 </table>

</body>
</html>