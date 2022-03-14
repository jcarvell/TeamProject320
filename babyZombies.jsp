<!DOCTYPE html>

<html>
	<head>
		<title>Baby Zombie Adventure Game</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		td.label {
			text-align: left;
		}
		</style>
	</head>


	<body>
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
	
		<form action="${pageContext.servletContext.contextPath}/game.java" method="post">
			<table>
				<tr>
					<td class="label">Welcome_to_the_Baby_Zombies_Game</td>
					<td><input type="text" name=start_game" size="20" value="${in}" /></td>
				</tr>

				

			</table>
			<input type="Submit" name="submit" value="Start Game">
		</form>
	</body>
</html>