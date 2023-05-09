<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Songs by : ${search}</h1>
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
        <td> <a href="${song.rating}">Rating</a></td>
        
	<td><form action="/song/${song.id}" method="post">
       <input type="hidden" name="_method" value="delete">
       <input type="submit" value="Delete">
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
<p><a href="/dashboard">dashboard</a><p>
</body>
</html>