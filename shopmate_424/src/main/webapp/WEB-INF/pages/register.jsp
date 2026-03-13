<%@ include file="header.jsp" %>

<div class="main-content">

<div class="form-container">

<h2>Create Account</h2>

<form action="/registerUser" method="post">

<input type="text" name="fullname" placeholder="Full Name">

<input type="email" name="email" placeholder="Email">

<input type="text" name="mobile" placeholder="Mobile Number">

<input type="text" name="username" placeholder="Username">

<input type="password" name="password" placeholder="Password">

<button type="submit">Register</button>

</form>

<p>Already Registered? <a href="/login">Go to Login</a></p>

</div>

</div>

<%@ include file="footer.jsp" %>