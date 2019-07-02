<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Vehicle Details for ${vehicle.vehicle_no}</h2>

<form>
	
	<table>
		
		<tr><td>ID: </td><td>${vehicle.vehicle_id}</td></tr>
		<tr><td>Make By: </td><td>${vehicle.vehicle_make}</td></tr>
		<tr><td>Model: </td><td>${vehicle.vehicle_model}</td></tr>
		<tr><td>Year: </td><td>${vehicle.vehicle_year}</td></tr>
		<tr><td>Owner: </td><td>${vehicle.vehicle_owner}</td></tr>
		
		
	</table>
</form>

</body>
</html>