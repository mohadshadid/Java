<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="/css/show.css">
</head>
<body>
<div class="header">
<h1>Expense Details </h1>
<p><a href="/expenses">Go Back</a> </p>
</div>
<div>
<p>Expenses Name  ${travel_one.name} </p>
<p>Expense Description ${travel_one.description}</p>
<p>Vendor  ${travel_one.vendor} </p>
<p>Amount Spent ${travel_one.amount}$</p>
</div>

</body>
</html>