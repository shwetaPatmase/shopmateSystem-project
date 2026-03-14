<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Bill</title>

<link rel="stylesheet" href="/css/style.css">

</head>

<body>

<%@ include file="header.jsp" %>

<h2 class="page-title">Receipt</h2>

<div class="bill-box">

<h3>Customer Details</h3>

<p>Name : ${customer.fullName}</p>
<p>Email : ${customer.email}</p>
<p>Mobile : ${customer.mobileNo}</p>

<hr>

<h3>Products</h3>

<table class="bill-table">

<tr>
<th>Product</th>
<th>Price</th>
<th>Qty</th>
<th>Total</th>
</tr>

<c:forEach var="p" items="${products}">

<tr>

<td>${p.name}</td>

<td>₹${p.price}</td>

<td>${p.qty}</td>

<td>₹${p.price * p.qty}</td>

</tr>

</c:forEach>

</table>

<h2 class="total">Total Amount : ₹${total}</h2>

<div class="bill-buttons">

<button onclick="window.print()" class="btn">Download Receipt</button>

<a href="/products" class="btn buy-more">Buy More</a>

</div>

</div>

<%@ include file="footer.jsp" %>

</body>
</html>