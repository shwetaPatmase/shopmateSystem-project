<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Products</title>
<link rel="stylesheet" href="/css/style.css">
</head>

<body>
<%@ include file="header.jsp" %>


<h2 style="text-align:center;">Available Products</h2>

<div class="products">

<c:forEach var="p" items="${products}">

<div class="card">

<img src="/images/${p.image}" width="120">

<h3>${p.name}</h3>

<p class="price">Price: ${p.price}</p>

<form action="/addtocart" method="post">

<input type="hidden" name="name" value="${p.name}">
<input type="hidden" name="price" value="${p.price}">
<input type="hidden" name="image" value="${p.image}">

<label>Quantity</label>
<input type="number" name="qty" value="1" min="1">

<button type="submit">Add to Cart</button>

</form>

</div>

</c:forEach>

</div>
<%@ include file="footer.jsp" %>

</body>
</html>