<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<title>Login</title>

<body>
<a href="registration.do">SignUp</a>
	<form:form method="POST" action="submitLogin.do" modelAttribute="userDTO">
		<table width="50%" border="0">
			<tr>
				<td><label><spring:message code="label.email.value" /> </label>
					<form:input path="email" id="email" />
				</td>
			</tr>
			<tr>
				<td><spring:message code="label.password.value" /> </label>
					<form:input path="password" id="password" />
				</td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>