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


		
	<form action="${pageContext.servletContext.contextPath}/Game" method = "post">
	<table>
	<tr>
		<td class ="label"> Health:  ${Health}  </td>
	</tr>
	<tr>
		<td class ="label"> EnemyHealth:  ${EnemyHealth}  </td>
	</tr>
	
	</table>	
			<p> "${response}" </p>
			
			<td class="label">input:</td>
			<td><input type="text" name="input" size="50" value="${input}" /></td>
	</form>
		
		<form action="${pageContext.servletContext.contextPath}/index" method="post">
			<input type="Submit" name="submithome" value="Home">
		</form>	
	</body>
</html>