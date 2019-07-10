<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel = "stylesheet" href="LocalStyle_Login.css">
</head>
<body>

<div class="main_background">
<p class="h1" style="text-align:center">Welcome Admin ${uname}</p>
	<div class="logo"><img alt="Department of Motor Traffic logo" src="logo.jpg" class="img-fluid"></div>
	<form action="vehicle.show" method="post">
		<table id="search">
			<tr style="float:left"  ><td>Enter the Vehicle Number</td><td><input type="text" name="vno"></td></tr>
			<tr style="float:left"><td><input type="submit" value="Search" class="btn btn-success"></td>
			<td><input type="reset" value="Clear"  class="btn btn-secondary" ></td>
			<td><a href="AddNew.jsp"><input type="button" value="Add New Vehicle" class="btn btn-primary"></a></td></tr>			
		</table>
	</form>
</div>
</body>
</html>