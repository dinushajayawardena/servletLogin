<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style_success.css" type="text/css" rel="stylesheet"> 
</head>
<body>
<h2>Welcome User ${uname}</h2>
<div class="main_background">
	<form action="vehicle.show" method="post">
		<table>
			<tr><td>Enter the Vehicle Number</td><td><input type="text" name="vno"></td></tr>
			<tr><td><input type="submit" value="Search"></td>
			<td><input type="reset" value="Clear"></td></tr>
			<td><a href="AddNew.jsp"><input type="button" value="Add New Vehicle"></a></td></tr>			
		</table>
	</form>
</div>
</body>
</html>