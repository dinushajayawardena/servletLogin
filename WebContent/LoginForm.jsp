<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel = "stylesheet" href="LocalStyle_Login.css">
</head>
<body>
<div class="main_background">
	<div class="logo"><img alt="Department of Motor Traffic logo" src="logo.jpg" class="img-fluid"></div>
	<form action="validate.do" method="post" class="form-group" id="form">
		<div class="table_content">
		<table>
			<tr><td>Enter Username</td><td><input type="text" name="uname" id="input"></td></tr>
			<tr><td>Enter Password</td><td><input type="password" name="pass" id="input"></td></tr>
		
			<div>
				<tr><td><input type="submit" value="Login" class="btn btn-primary"></td>
				<td><input type="reset" class="btn btn-secondary"></td></tr>
				</div>
		</table>
		</div>
	</form>
</div>
</body>
</html>