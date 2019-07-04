<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link href="style_login.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="main_background">
	<form action="validate.do" method="post" class="form_background">
		<div class="table"><table>
			<tr><td>Enter Username</td><td><input type="text" name="uname"></td></tr>
			<tr><td>Enter Password</td><td><input type="password" name="pass"></td></tr>
			<tr>
				<td><div class="button"><input type="submit" value="Login"></div></td><td><div class="button"><input type="reset"></div></td>
				
			</tr>
			
		</table>
		</div>
	</form>
</div>
</body>
</html>