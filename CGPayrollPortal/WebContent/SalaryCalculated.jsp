<head>
<meta charset="ISO-8859-1">
<title>Calculate Salary</title>
<link rel="stylesheet" type="text/css" href="css/default.css" />
</head>
<body>
<a href="IndexPage.jsp">Home</a>
	<form action="CalculateSalaryServlet" class="register" name="loginform">
		<h1>Salary Details Are:</h1>
		<fieldset class="row1">
			<font color="Green" size="15px" > 
			Net Salary: ${requestScope.salary.netSalary} <br>
			Monthly Tax: ${requestScope.salary.monthlyTax }
			  </font>
		</fieldset>
	</form>
	<p align="center"> © Capgemini 2019</p>
</body>
</html>