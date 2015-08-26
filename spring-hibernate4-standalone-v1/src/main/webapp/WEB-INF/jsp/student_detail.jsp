<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="/resources/css/app.css">
    <title>Student Detail</title>

</head>
    
<body>
    <jsp:include page="../include/header.jsp" />
    <h2>Student Detail</h2>
    <p>
        <a href="${pageContext.request.contextPath}/students/${student.id}/update">Update</a>
    </p>
    <table>
        <tr>
            <td>ID</td>
            <td>${student.id}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${student.email}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${student.name}</td>
        </tr>
    </table>
        
    
    <jsp:include page="../include/footer.jsp" />
</body>
</html>