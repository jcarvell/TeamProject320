<!DOCTYPE html>

<html>
	<head>
		<title>Baby Zombie Adventure Game</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		.label {
			text-align: center;
		}
		</style>
	</head>


	<body>

<h1 class="label">Baby Zombies Game</h1>
			<input type="Submit" name="submit" value="Enter">
		
	<form action="${pageContext.servletContext.contextPath}/Game" method = "post">
		  
		  <td class="label">input:</td>
			<td><input type="text" name="input" size="50" value="${input}" /></td>



		<td class ="label"> Response: </td>
			<p> "${response}" </p>
	</form>
		
		<form action="${pageContext.servletContext.contextPath}/index" method="post">
			<input type="Submit" name="submithome" value="Home">
		</form>	
	</body>
</html>