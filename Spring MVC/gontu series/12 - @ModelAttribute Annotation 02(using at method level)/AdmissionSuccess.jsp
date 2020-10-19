<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<html>
	<body>
		<h1>${headerMessage}</h1>
		<h1>Congratulations! Engerriend college has processed your addminssion form succesfully</h1>
		<h2>Details submited by you</h2>
		<table>
			<tr>
				<td>Student name :</td>
				<td>${student1.studentName}</td>
			</tr>
			<tr>
				<td>Student Hobby :</td>
				<td>${student1.studentHobby}</td>
			</tr>
		</table>
	</body>
	</html>