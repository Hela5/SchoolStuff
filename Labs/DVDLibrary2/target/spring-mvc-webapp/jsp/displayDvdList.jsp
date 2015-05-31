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
            <h1>DVD Library</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/displayDvdList">Display Library</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                </ul> 
            </div>
        </div>

        <div class="container">
            <a href='displayNewDvdForm'>Add Dvd</a>
            <hr/>
            <c:forEach var="dvd" items="${dvdList}" >
                <s:url value="deleteDvd" var="deleteDvd_url">
                    <s:param name="dvdId" value="${dvd.id}" />
                </s:url>
                <s:url value="displayEditDvd" var="editDvdForm_url">
                    <s:param name="dvdId" value="${dvd.id}"/>
                </s:url>

                Title: ${dvd.title} | <a href="${deleteDvd_url}">Delete</a> | <a href="${editDvdForm_url}">Edit</a> | <br />
                Release Date: ${dvd.releaseDate} <br />
                MPAA Rating: ${dvd.mpaaRating} <br />
                Director: ${dvd.director} <br />
                Studio: ${dvd.studio} <br />
                Note: ${dvd.note} <br />
                <hr />
            </c:forEach>


        </div>



        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

