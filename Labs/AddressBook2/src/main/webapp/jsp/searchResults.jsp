<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index Page</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1>Address Book</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayAddList">Addresses</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/searchResults">Search</a></li>

                </ul>    
            </div>
            <div class="container">
                <a href="displayNewAddForm">Add Address</a>
                <hr />
                <c:forEach var="address" items="${aList}">
                    <s:url value="deleteAddress" var="deleteAddress_url">
                        <s:param name="addId" value="${address.iD}" />
                    </s:url>
                    <s:url value="displayEditAddForm" var="editAddForm_url">
                        <s:param name="addId" value="${address.iD}" />
                    </s:url>

                    Name: ${address.firstName} ${address.lastName} | <a href="${deleteAddress_url}">Delete</a> | <a href="${editAddForm_url}">Edit</a> | <br />
                    Street Address: ${address.streetAddress} <br />
                    City: ${address.city} <br />
                    State: ${address.state} <br />
                    ZipCode: ${address.zipCode} <br />
                    <hr />
                </c:forEach>
            </div>
            <!-- Placed at the end of the document so the pages load faster -->
            <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
            <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

