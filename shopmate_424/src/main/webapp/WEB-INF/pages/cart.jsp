<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>

<title>Your Cart</title>

<link rel="stylesheet" href="/css/style.css">

</head>

<body>
<%@ include file="header.jsp" %>

<div class="navbar">
<a href="/products">Products</a>
<a href="/cart">Cart</a>
<a href="/login">Logout</a>
</div>

<h2 style="text-align:center;">Your Cart</h2>

<table class="cart-table">

<tr>
<th>Product</th>
<th>Price</th>
<th>Quantity</th>
</tr>

<c:forEach var="c" items="${cartItems}">

<tr>

<td>

<img src="/images/${c.image}" class="cart-img">

<br>

${c.name}

</td>

<td>
₹${c.price}
</td>

<td>
${c.qty}
</td>

</tr>

</c:forEach>

</table>
<%@ include file="footer.jsp" %>
</body>

</html>