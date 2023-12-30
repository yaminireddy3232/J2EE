<%@ page language="java" contentType="text/html" import="java.util.Date"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<c:if test="${saveResult==1}">
Data Inserted Successfully.....${saveResult}
</c:if>
<c:if test="${saveResult==0}">
Data Insertion Fail.....${saveResult}
 <jsp:include page="add-user.html"></jsp:include>
</c:if>

</body>
</html>