<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
	<head>
		<title>Index view</title>
		<style type="text/css">
		body{
		background-color: black;
		color: red; 
		}
		h1{
		font-size: 30px;
		text-align: center;
		font-family: Chalkduster;
		font-weight: 900;
		}
		p{
		font-size: 25px;
		text-align: center;
		}
<<<<<<< HEAD
=======
		input{
			font-family:monospace;
			padding:"200px"
			font-color:white;
			background-color:lightgreen;
			padding:50px; 
			font-size:25px; 
			font-color:green;
			border-radius:25%;
			
		}
		
>>>>>>> Pleasework
		
		
		</style>
	</head>

	<body>
		<h1>Welcome to the Baby Zombies TBAG</h1>
		<p>Press Start Game or return to login</p>
		
		<form action="${pageContext.servletContext.contextPath}/Game" method="get">
			<input type="Submit" name="submit" value="Start Game">

		<br>
		<form action="${pageContext.servletContext.contextPath}/Login" method="post">
			<input type="Submit" name="submit" value="Login">
		</form>
		
<<<<<<< HEAD
=======
		<br><br><form action="${pageContext.servletContext.contextPath}/Game" method="get">
			<input class="button" type="Submit" name="submit" value="Start Game">
		</form>
		
		
>>>>>>> Pleasework
		
	</body>
</html>