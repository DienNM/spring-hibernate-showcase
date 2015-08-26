<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="resources/css/app.css">
    <title>List of Students</title>

</head>
    
<body>
    <jsp:include page="../include/header.jsp" />
    <h2>List of Students</h2>
    
    <p>
        <c:if test="${not empty error}">
            <span class = "error">${error}</span>
        </c:if>
        <c:if test="${not empty success}">
            <span class = "success">${success}</span>
        </c:if>
    </p>
    <c:if test="${empty results}">
        No Students
    </c:if>
   
    <c:if test="${not empty results}">
        <table border = 1>
	        <thead>
	            <tr>
	                <th>ID</th>
	                <th>Email</th>
	                <th>Full Name</th>
	                <th>Gender</th>
	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach items="${results}" var="student">
	                <tr>
	                    <td>
	                        <c:url var="detailUrl" value="/students/${student.id}" />
	                        <a href="${detailUrl }">${student.id}</a>
	                    </td>
	                    <td>${student.email}</td>
	                    <td>${student.fullName}</td>
	                    <td>${student.gender}</td>
	                </tr>
	            </c:forEach>
	                
	        </tbody>
	    </table>
    </c:if>
    
    
    
    <jsp:include page="../include/footer.jsp" />
</body>
</html>