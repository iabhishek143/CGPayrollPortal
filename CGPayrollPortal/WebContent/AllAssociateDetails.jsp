<head>
<meta charset="ISO-8859-1">
<title>Associate Details</title>
<link rel="stylesheet" type="text/css" href="css/default.css" />
</head>
<body>
<a href="IndexPage.jsp">Home</a>
	<form action="CalculateSalaryServlet" class="register" name="loginform">
		<h1>Associate Details Are:</h1>
		<fieldset class="row1">
			<div align="left"> 
			<table> 
			<tr>
			<td>Associate ID</td>
			<td>: ${requestScope.associate.associateID} <br> </td>
			</tr><tr>
			<td>Name</td>
			<td>: ${requestScope.associate.firstName} ${requestScope.associate.lastName}<br></td>
			</tr><tr>
			<td>Email</td>
			<td>: ${requestScope.associate.emailId} <br></td>
			</tr><tr>
			<td>Department</td>
			<td>: ${requestScope.associate.department} <br></td>
			</tr><tr>
			<td>Designation</td>
			<td>: ${requestScope.associate.designation} <br></td>
			</tr><tr>
			<td>Net Salary</td>
			<td>: ${requestScope.associate.salary.netSalary} <br></td>
			</tr><tr>
			<td>Monthly Tax</td>
			<td>: ${requestScope.associate.salary.monthlyTax} <br></td>
			</tr><tr>
			<td>Acc Number</td>
			<td>: ${requestScope.associate.bankDetails.accountNumber} <br></td>
			</tr>
			</table>		
			</div>
		</fieldset>
	</form>
	<p align="center"> © Capgemini 2019</p>
</body>
</html>