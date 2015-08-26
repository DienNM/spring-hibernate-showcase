<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Student</title>

</head>
    
<body>
    <jsp:include page="../include/header.jsp" />
    <h2>Add New Student</h2>
    
    <c:url var="addActionUrl" value="/students" />
    
    <form:form action="${addActionUrl}" method="POST" modelAttribute="student">
        <table>
            <tr>
                <td>Email (*)</td>
                <td><form:input path="email"></form:input> </td>
            </tr>
            <tr>
                <td>First Name (*)</td>
                <td><form:input path="firstName"></form:input> </td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><form:input path="lastName"></form:input> </td>
            </tr>
            <tr>
                <td>Date Of Birth</td>
                <td><form:input path="dateOfBirth"></form:input> </td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>
                    <form:select path="gender" items="${genders}" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="reset">
                    <input type="submit">
                </td>
            </tr>
        </table>
    </form:form>
	    
    
    <jsp:include page="../include/footer.jsp" />
</body>
</html>