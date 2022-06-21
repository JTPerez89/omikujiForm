<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<header>
		<h1>Send an Omikuji!</h1>
	</header>
	<form action="/create" method="POST">
		<div class="form-group">
			<label for="number">Pick any number 5-25:</label> <input
				type="number" name="number" />
		</div>
		<div class="form-group">
			<label for="city">Enter the name of any city:</label> <input
				type="text" name="city" />
		</div>
		<div class="form-group">
			<label for="person">Enter the name of any real person:</label> <input
				type="text" name="person" />
		</div>
		<div class="form-group">
			<label for="hobby">Enter professional endeavor or hobby:</label> 
			<input type="text" name="hobby" />
		</div>
		<div class="form-group">
			<label for="thing">Enter the name of any living thing:</label> 
			<input type="text" name="thing" />
		</div>
		<div class="form-group">
			<label for="nice">Say something nice to someone:</label>
			<textarea name="nice" rows="4" cols="40"></textarea>
		</div>
		<button type="submit" class="btn">Send</button>
	</form>
</body>
</html>