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
            <h1>Interest Calculator</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/displayInterestC">Interest Calculator</a></li>
                </ul>    
            </div>
            <h1 style="text-align: center">Welcome to Your Bank's Interest Calculator!</h1>
            <h4 style="text-align: center">A few questions to set everything up...</h4><br>
            <p style="text-align: center">Enter the Annual Percentage Rate:</p>
            <form style="text-align: center" action="submitInterestC" method="POST">
                <input type="text" name="percentRate"/>

            <p style="text-align: center">Enter the Amount of Principal:</p>
                <input type="text" name="principal"/>

            <p style="text-align: center">Enter the number of years that the money is to stay in the fund:</p>
                <input type="text" name="years"/>

            <p style="text-align: center">Select the kind of compounding interest you would prefer:</p>
                <select name="typeInterest">
                    <option value="daily">Daily</option>
                    <option value="monthly">Monthly</option>
                    <option value="quarterly">Quarterly</option>
                </select><br>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>
