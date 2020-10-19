<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	
	<html>
		<body>
			<h1>${headerMessage}</h1>
			<h2><spring:message code="label.admissionForm" /></h2>
			
			<form:errors path="student1.*"/>
			<form action="submitAdmissionForm.html" method="post">
				<table>
				<tr>
					<td><spring:message code="label.studentName" /></td><td> <input type="text" name="studentName"/></td>
				<tr>
				<tr>
					<td><spring:message code="label.studentHobby" /></td><td> <input type="text" name="studentHobby"/></td>
				</tr>
				<tr>
					<td><spring:message code="label.studentMobile" /></td><td><input type="text" name="studentMobile"/></td>
				</tr>
				<tr>
					<td><spring:message code="label.studentDOB" /></td> <td><input type="text" name="studentDOB"/></td>
				</tr>
				<tr>
					<td><spring:message code="label.studentSkills" /></td> <td><select name="studentSkills" multiple>
															<option value="Java Core">Java Core</option>
															<option value="Spring Core">Spring Core</option>
															<option value="Spring MVC">Spring MVC</option>
														</select></td>
				</tr>
				
				</table>
				<table>
				<tr><td><spring:message code="label.studentAddress" /></tr>
				<tr>
					<td><spring:message code="label.country" /><input type="text" name="studentAddress.country"/></td>
					<td><spring:message code="label.city" /><input type="text" name="studentAddress.city"/></td>
					<td><spring:message code="label.street" /><input type="text" name="studentAddress.street"/></td>
					<td><spring:message code="label.pincode" /><input type="text" name="studentAddress.pincode"/></td>
				</tr>
				<tr>
					<spring:message code="label.submit.admissionForm" var="LabelSubmitAdmissionForm"></spring:message>
					<td><input type="submit" value="${LabelSubmitAdmissionForm}" /> </td>
				</tr>
				</table>
			</form>
		</body>
	</html>