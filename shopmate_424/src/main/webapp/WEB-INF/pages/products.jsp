<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="header.jsp" %>

<div class="main-content">

<h2 style="text-align:center;">Products</h2>

<div class="products">

<c:forEach var="p" items="${products}">

<div class="card">

<img src="/images/${p.image}">

<h3>${p.name}</h3>

<p>₹${p.price}</p>

<button>Add to Cart</button>

</div>

</c:forEach>

</div>

</div>

<%@ include file="footer.jsp" %>