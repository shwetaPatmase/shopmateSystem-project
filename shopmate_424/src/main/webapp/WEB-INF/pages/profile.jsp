<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Profile</title>

<link rel="stylesheet" href="/css/style.css">

</head>

<body>

<%@ include file="header.jsp" %>

<div class="main-content">

<div class="profile-card">

<img src="/images/user.png" class="avatar">

<h2>User Profile</h2>

<p>Username : ${customer.userName}</p>
<p>Email : ${customer.email}</p>
<p>Full Name : ${customer.fullName}</p>
<p>Mobile : ${customer.mobileNo}</p>

<hr class="profile-line">

<div class="profile-actions">

<a href="/products" class="view-products-btn">
🛒 Explore Products
</a>
<a href="/edit-profile" class="edit-btn">Edit Profile</a>

</div>

</div>

</div>

<%@ include file="footer.jsp" %>

</body>
</html>