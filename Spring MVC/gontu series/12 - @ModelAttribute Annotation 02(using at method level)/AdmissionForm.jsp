<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	<html>
		<body>
			<h1>${headerMessage}</h1>
			<h1>Students addmission form for enginerring courses</h1>
			<form action="submitAdmissionForm.html" method="post">
				<p>
					Student's Name : <input type="text" name="studentName"/>
				</p>
				<p>
					Student's Hobby : <input type="text" name="studentHobby"/>
				</p>
				<input type="submit" value="submit this form by click here"/>
			</form>
		</body>
	</html>