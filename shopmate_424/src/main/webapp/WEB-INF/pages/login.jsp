<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="main-content">

<div class="form-container">

<h2>Login</h2>

<form action="/verify-login" method="post">
<p style="color:red">${msg}</p>

</script>

<input type="text" name="userName" placeholder="Username">

<input type="password" name="password" placeholder="Password">

<button type="submit">Login</button>

</form>

<p>New User ? <a href="/register">Register First</a></p>

</div>

</div>

<%@ include file="footer.jsp" %>
</body>
</html>