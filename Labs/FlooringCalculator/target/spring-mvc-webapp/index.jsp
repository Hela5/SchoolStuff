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
            <h1>Flooring Calculator</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayFlooring">Flooring Calculator</a></li>

                </ul>    
            </div>
                    <h2 style='text-align: center'>Leave the work to us....</h2> <hr /> 
            <p style='text-align: center'>In order to properly calculate your future flooring costs, we will ask you to please enter the length and width of the area to be covered.</p>
            <p style='text-align: center'>We will then calculate the cost based on our team which can cover an area of 20 square feet per hour.</p>
            <p style='text-align: center'>They charge $86.00 per hour, with a 15 minute increment billing cycle.</p>
            <p style='text-align: center'>We have calculated to the quarter hour, how much it will cost to fully install your flooring with material and labor costs.</p>

        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

