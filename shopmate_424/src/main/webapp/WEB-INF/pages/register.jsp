<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page register</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="main-content">

<div class="form-container">

<h2>Create Account</h2>

<form action="/add-Customer" method="post">

<input type="text" name="fullName" placeholder="Full Name">

<input type="email" name="email" placeholder="Email">

<input type="text" name="mobileNo" placeholder="Mobile Number">

<input type="text" name="userName" placeholder="Username">

<input type="password" name="password" placeholder="Password">

<button type="submit">Register</button>

</form>

<p>Already Registered? <a href="/login">Go to Login</a></p>

</div>

</div>

<%@ include file="footer.jsp" %>
</body>
</html>