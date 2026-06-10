<html>

<head>
<title>Edit User</title>
</head>

<body>

<h2>Update User</h2>

<form action="/update" method="post">

<input type="hidden"
name="id"
value="${user.id}">

Full Name:

<input type="text"
name="fullName"
value="${user.fullName}">
<br><br>

Address:

<input type="text"
name="address"
value="${user.address}">
<br><br>

Mobile Number:

<input type="text"
name="mobileNumber"
value="${user.mobileNumber}">
<br><br>

Username:

<input type="text"
name="username"
value="${user.username}">
<br><br>

Password:

<input type="text"
name="password"
value="${user.password}">
<br><br>

<input type="submit"
value="Update">

</form>

</body>
</html>