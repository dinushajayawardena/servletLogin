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

<h2>Vehicle Details for ${vehicle.vehicle_no}</h2>

<form>
	
	<table class="table table-dark">
		
		<tr><td>ID: </td><td>${vehicle.vehicle_id}</td></tr>
		<tr><td>Make By: </td><td>${vehicle.vehicle_make}</td></tr>
		<tr><td>Model: </td><td>${vehicle.vehicle_model}</td></tr>
		<tr><td>Year: </td><td>${vehicle.vehicle_year}</td></tr>
		<tr><td>Owner: </td><td>${vehicle.vehicle_owner}</td></tr>
		
		
	</table>
	
	<a href="Success.jsp"><input type="button" value="Back" class="btn btn-primary" style="margin-left:43%"></a>
</form>
</div>
</body>
</html>