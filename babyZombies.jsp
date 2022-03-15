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

<h1 class="label">Welcome to the Baby Zombies Game</h1>

		<form action="${pageContext.servletContext.contextPath}/game.java" method="post">
			<table>


			</table>
			<input type="Submit" name="submit" value="Start Game">
		</form>
	</body>
</html>