<%@ include file="/WEB-INF/pages/header-user.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>Edit Profile</title>
<link rel="stylesheet" href="/css/style.css">
</head>

<body>

<%@ include file="header-user.jsp" %>

<div class="form-container">

<h2>Edit Profile</h2>

<form action="/update-profile" method="post">

<input type="text" name="fullName" value="${customer.fullName}" required>

<input type="email" name="email" value="${customer.email}" required>

<input type="text" name="mobileNo" value="${customer.mobileNo}" required>

<input type="text" name="userName" value="${customer.userName}" required>

<input type="password" name="password" value="${customer.password}" required>

<button type="submit">Update</button>

</form>

</div>

</body>
</html>