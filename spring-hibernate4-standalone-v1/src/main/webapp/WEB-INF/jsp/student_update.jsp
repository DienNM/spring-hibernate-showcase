<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Student</title>

</head>
    
<body>
    <jsp:include page="../include/header.jsp" />
    <h2>Update Student: ${student.id}</h2>
    
    <c:url var="deleteActionUrl" value="/students/${student.id}/delete" />
    <form action="${deleteActionUrl}" method="POST">
        <button type="submit">Delete</button>
    </form>
    
    <c:url var="updateActionUrl" value="/students/${student.id}" />
    <form:form action="${updateActionUrl}" method="PUT" modelAttribute="student">
        <table>
            <tr>
                <td>Email (*)</td>
                <td><form:input path="email" /> </td>
            </tr>
            <tr>
                <td>Name (*)</td>
                <td><form:input path="name" /> </td>
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