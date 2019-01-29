<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head >
<title>Payroll Registration Form</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"   href="css/default.css" />
</head>
<body>
<a href="IndexPage.jsp">Home</a>
	<form action="AcceptAssociateServlet" class="register">
		<h1>Registration</h1>
		<fieldset class="row1">
			<legend>Personal Details </legend>
			<p>
				<label>First Name * </label> <input name="firstname" type="text" />
				<label>Last Name * </label> <input name="lastname" type="text" />
				 <label
					class="obinfo">* obligatory fields </label>
			</p>
		</fieldset>
		<fieldset class="row2">
			<legend>Account Details </legend>
			<p>
				<label>Email ID * </label> <input name="email" type="text"
					class="long"/>
			</p>
			<p>
				<label>Department * </label> <input name="department" type="text"
					class="long" />
			</p>
			<p>
				<label>Designation * </label> <input name="designation" type="text"
					class="long" />
			</p>
			<p>
				<label>Pan Number * </label> <input name="pannumber" type="text"
					class="long" />
			</p>
			<p>
				<label>Bank Name * </label> <input name="bankname" type="text"
					class="long" />
			</p>
			<p>
				<label>Account Number* </label> <input name="accnumber" type="text"
					class="long" />
			</p>
			<p>
				<label>IFSC Code * </label> <input name="ifsc" type="text"
					class="long" />
			</p>
		</fieldset>
		<fieldset class="row3">
			<legend>Further Information </legend>
			
			<p>
				<label>Basic Salary * </label> <input name="basicsal" type="text"
					maxlength="10" />
			</p>
			<p>
				<label>E PF * </label> <input name="epf" type="text"
					maxlength="10" />
			</p>
			<p>
				<label>Company PF * </label> <input name="cpf" type="text"
					maxlength="10" />
			</p>
			<p>
				<label>Yearly Investment Under 80C * </label> <input
					name="investment" type="text" maxlength="6" />
			</p>
		</fieldset>
		<fieldset class="row4">
			<legend>Terms and Mailing </legend>
			<p class="agreement">
				<input type="checkbox" value="" /> <label>* I accept the <a
					href="#">Terms and Conditions</a></label>
			</p>
			<p class="popup">
			${requestScope.success }
			</p>
			
		</fieldset>

		<div>
			<button class="button" type="submit" value="Submit" id="myBtn">Register &raquo;</button>
		</div>
		<div>
			<button class="button">Sign Up &raquo;</button>
		</div>
	</form>
	<p align="center"> © Capgemini 2019</p>
</body>
</html>