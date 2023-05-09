<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h1>Add Song</h1>
<form:form action="/songs/new" method="post" modelAttribute="allSong">
   
    <div class="mb-3">
        <form:label class="form-label" path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input class="form-control" path="title"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="artist">Artist</form:label>
        <form:errors path="artist"/>
        <form:textarea class="form-control" path="artist"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:input class="form-control" path="rating"/>
    </div>
    <button class="btn btn-primary" type="submit">Add</button>
</form:form>
<p><a href="/dashboard">dashboard</a><p>
 
</body>
</html>