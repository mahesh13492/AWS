<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>

<title>Registration</title>

</head>
<body>

	<form:form method="POST" action="registration.do"
		modelAttribute="Registration">
		<table width="100%" border="0">
			<tr>
				<td><spring:message code="label.firstName.value" /> <form:input path="firstName" id="firstName" />
				</td>
			<tr>
				<td><spring:message code="label.lastName.value" /> <form:input path="lastName" id="lastName" />
				</td>
			<tr>
				<td><spring:message code="label.email.value" /> <form:input path="email" id="email" />
				</td>
			<tr>
				<td><spring:message code="label.password.value" /> <form:password path="password" id="password" />
				</td>
			<tr>
				<td><spring:message code="label.contact.value" /> <form:input path="contact" id="contact" />
				</td>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>