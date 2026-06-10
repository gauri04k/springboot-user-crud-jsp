<%@ page language="java"%>
<%@ taglib prefix="c"
uri="jakarta.tags.core"%>

<html>
<head>
<title>User Registration</title>
</head>

<body>

<h2>User Registration Form</h2>

<form action="save" method="post">

Full Name:
<input type="text" name="fullName"><br><br>

Address:
<input type="text" name="address"><br><br>

Mobile Number:
<input type="text" name="mobileNumber"><br><br>

Username:
<input type="text" name="username"><br><br>

Password:
<input type="password" name="password"><br><br>

<input type="submit" value="Save">

</form>

<hr>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Address</th>
<th>Mobile</th>
<th>Username</th>
<th>Password</th>
<th>Action</th>
</tr>

<c:forEach items="${users}" var="u">

<tr>

<td>${u.id}</td>
<td>${u.fullName}</td>
<td>${u.address}</td>
<td>${u.mobileNumber}</td>
<td>${u.username}</td>
<td>${u.password}</td>

<td>
<a href="edit/${u.id}">Edit</a>

|

<a href="delete/${u.id}">
Delete
</a>

</td>

</tr>

</c:forEach>

</table>

</body>
</html>