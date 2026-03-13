<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>profile</title>
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

</div>

</div>

<%@ include file="footer.jsp" %>
</body>
</html>