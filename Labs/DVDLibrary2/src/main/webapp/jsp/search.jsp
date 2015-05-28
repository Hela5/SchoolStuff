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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayDvdList">Display Library</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                </ul> 
            </div>
            <form class="form-horizontal col-md-4"
                  role="form"
                  action="searchResults"
                  method="POST">

                <select name="searchBy" class="form-control col-md-2" role="menu" aria-labelledby="dropdownMenu1">
                    <option value="title" role="presentation"><a role="menuitem" tabindex="-1" href="#">Title</a></option>
                    <option value="rating"role="presentation"><a role="menuitem" tabindex="-1" href="#">Rating</a></option>
                    <option value="studio"role="presentation"><a role="menuitem" tabindex="-1" href="#">Studio</a></option>
                </select>

                <div class="form-group" >
                    <label for="add-search-by" class="col-md-4 control-label">Search DVDs</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-search-by"
                               name="searchVal"
                               placeholder="Search" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" 
                                id="add-button"
                                class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </form>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

