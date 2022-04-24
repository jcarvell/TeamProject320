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
			<input type="Submit" name="submit" value="Start Game">
		</form>
		<form action="${pageContext.servletContext.contextPath}/game.java">
		  <label for="userText">Your decision</label>
		  <input type="text" id="userText" name="userText"><br><br>
		</form>
		
		
	</body>
</html>