<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/default.css" />
</head>
<body>
	<form action="LoginServlet" class="register" name="loginform" method="post">
		<h1>Log In</h1>

		<fieldset class="row1">
			<legend>Enter Login Credentials </legend>
			<p>
				<label>Email * </label> <input name="associateId" type="text" /> <label>Repeat
					email * </label> <input type="text" />
			</p>
			<p>
				<label>Password* </label> <input name="password" type="password" /> <label>Repeat
					Password* </label> <input type="password" /> <label class="obinfo">*
					obligatory fields </label>
			</p>
			<div>
				<button class="button">Login &raquo;</button>
				<input type="reset" value="reset"	name="Reset" class="button">		</div>
		</fieldset>
	</form>
</body>
</html>