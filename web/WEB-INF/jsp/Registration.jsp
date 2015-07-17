<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<form:form method="post"
		action="${pageContext.request.contextPath}/doRegistration"
		commandName="registration">
		<div>
			<h1>Registration</h1>

			First Name :
			<form:input id="fName" type="text" path="firstName" />
			<form:errors path="firstName" />
			Last Name : <input id="lName" type="text" path="lastName" />
			<form:errors path="lastNmae" />
			Email :

			<form:input id="email" type="text" path="email" />
			<form:errors path="email" />
			Year Born : <select id="year" path="year">


				<option value="1977">1977</option>
				<option value="1978">1978</option>
				<option value="1979">1979</option>
				<option value="1980">1980</option>
				<option value="1981">1981</option>
				<option value="1982">1982</option>
				<option value="1983">1983</option>
				<option value="1984">1984</option>
				<option value="1985">1985</option>
				<option value="1986">1986</option>


			</select>
			<form:errors path="year" />
			Gender :
			<form:radiobutton id="female" path="gender" value="female" />
			Female
			<form:radiobutton id="male" path="gender" value="male" />
			Male
			<form:button type="submit" value="Submit" />
		</div>
	</form:form>
</body>
</html>