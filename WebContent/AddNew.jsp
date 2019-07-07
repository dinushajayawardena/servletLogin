<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Vehicle</title>
</head>
<body>
<form action="vehicle.add" method="post">
	<table>
		<tr><td>Enter Vehicle Number: </td><td><input type="text" name="txtvnumber"></td></tr>
		<tr><td>Select the Manufacturer: </td>
			<td><select name="cmbvmake" size="1">
					<option selected disabled>Select a Manufacturer</option>
					<option value="Toyota">Toyota</option>
					<option value="Tata">Tata</option>
					<option value="Bajaj">Bajaj</option>
					<option value="Nissan">Nissan</option>
					<option value="Mitsubishi">Mitsubishi</option>
					<option value="Izuzu">Izuzu</option>
					<option value="Kia">Kia</option>
				</select>
			</td>
		</tr>
		<tr><td>Enter the Model: </td><td><input type="text" name="txtvmodel"></td></tr>
		<tr><td>Select the Manufac. year: </td>
			<td>
				<select name="cmbvyear" size ="1">
					<option selected disabled>Select a Year</option>
					<option value="2019">2019</option>
					<option value="2018">2018</option>
					<option value="2017">2017</option>
					<option value="2016">2016</option>
					<option value="2015">2015</option>
					<option value="2014">2014</option>
					<option value="2013">2013</option>
					<option value="2012">2012</option>
					<option value="2011">2011</option>
					<option value="2010">2010</option>
					<option value="2009">2009</option>
					<option value="2008">2008</option>
					<option value="2007">2007</option>
					<option value="2006">2006</option>
					<option value="2005">2005</option>
					<option value="2004">2004</option>
					<option value="2003">2003</option>
					<option value="2002">2002</option>
					<option value="2001">2001</option>
					<option value="2000">2000</option>
					<option value="1999">1999</option>
					<option value="1998">1998</option>
					<option value="1997">1997</option>
					<option value="1996">1996</option>
					<option value="1995">1995</option>
					<option value="1994">1994</option>
					<option value="1993">1993</option>
					<option value="1992">1992</option>
					<option value="1991">1991</option>
					
				</select>
			</td>
		</tr>
		<tr><td>Enter the Owners Name: </td><td><input type="text" name="txtvowner"></td></tr>
		<tr><td><input type="submit" name="submit" value="Add Vehicle"></td></tr>
	
	</table>
</form>

</body>
</html>