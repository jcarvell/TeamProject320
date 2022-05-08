<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
	<head>
		<title>Index view</title>
	</head>

	<body>
		<h1>Welcome to the Baby Zombies TBAG</h1>
		<p>Press Start Game or Load a saved game</p>
		
	<form action="${pageContext.servletContext.contextPath}/Game" method = "get">
	<input type="Submit" name="submitgame" value="Start Game">
	</form>
		
		
	</body>
</html>