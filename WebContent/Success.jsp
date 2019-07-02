<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome User ....<%request.getParameter("uname");%></h2>
<div>
	<form action="vehicle.show" method="get">
		<table>
			<tr><td>Enter the Vehicle Number</td><td><input type="text" name="vno"></td></tr>
			<tr><td><input type="submit" value="Search"></td>
			<td><input type="reset" value="Clear"></td></tr>			
		</table>
	</form>
</div>
</body>
</html>