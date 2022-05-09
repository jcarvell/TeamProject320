<!DOCTYPE html>

<html>
	<head>
		<title>Baby Zombie Adventure Game</title>
		
		<head>
		<title>Add Numbers</title>
		<style type="text/css">
		body{
		background-color: black;
		color: red; 
		font-size: 20px;
		
		}
		h1{
		font-size: 50px;
		text-align: center;
		font-family: Chalkduster;
		}
		
		</style>
	</head>


	<body>

<h1 class="label">Baby Zombies Game</h1>
			
		
	<form action="${pageContext.servletContext.contextPath}/Game" method = "post">
	<table>
	<tr>
		<td class ="label"> Health:  ${Health}  </td>
	</tr>
	<tr>
		<td class ="label"> EnemyHealth:  ${EnemyHealth}  </td>
	</tr>
	
	</table>		
			<td class="label">input:</td>
			<td><input type="text" name="input" size="50" value="${input}" /></td>
			<input type="Submit" name="submit" value="Enter">


		<td class ="label"> <p>Response:<p></td>
			<p> "${response}" </p>
	</form>
		
		<form action="${pageContext.servletContext.contextPath}/index" method="post">
			<input type="Submit" name="submithome" value="Home">
		</form>	
	</body>
</html>