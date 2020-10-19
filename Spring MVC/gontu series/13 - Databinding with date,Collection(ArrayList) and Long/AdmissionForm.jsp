<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	<html>
		<body>
			<h1>${headerMessage}</h1>
			<h1>Students addmission form for enginerring courses</h1>
			<form action="submitAdmissionForm.html" method="post">
				<table>
				<tr>
					<td>Student's Name :</td><td> <input type="text" name="studentName"/></td>
				<tr>
				<tr>
					<td>Student's Hobby :</td><td> <input type="text" name="studentHobby"/></td>
				</tr>
				<tr>
					<td>Student's Mobile :</td><td><input type="text" name="studentMobile"/></td>
				</tr>
				<tr>
					<td>Student's DOB : </td> <td><input type="text" name="studentDOB"/></td>
				</tr>
				<tr>
					<td>Student's skill set : </td> <td><select name="studentSkills" multiple>
															<option value="Java Core">Java Core</option>
															<option value="Spring Core">Spring Core</option>
															<option value="Spring MVC">Spring MVC</option>
														</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit this form by click here"/></td>
				</tr>
				</table>
			</form>
		</body>
	</html>