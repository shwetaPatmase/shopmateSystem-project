<%@ include file="header.jsp" %>

<div class="main-content">

<div class="form-container">

<h2>Login</h2>

<form action="/loginUser" method="post">

<input type="text" name="username" placeholder="Username">

<input type="password" name="password" placeholder="Password">

<button type="submit">Login</button>

</form>

<p>New User ? <a href="/register">Register First</a></p>

</div>

</div>

<%@ include file="footer.jsp" %>