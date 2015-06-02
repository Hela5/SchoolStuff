<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

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
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/displayAddList">Addresses</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/searchAddForm">Search</a></li>

                </ul>    
            </div>

            <div class="col-md-6">
                <form class="form-horizontal"
                      role="form"
                      action="searchResults"
                      method="POST">


                    <div class="form-group" >
                        <label for="add-search-by" class="col-md-4 control-label">Search Addresses</label>
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
                            
                        <select name="searchBy"
                                role="menu"
                                aria-labelledby="dropdownMenu1">
                            <option value="city" role="presentation"><a role="menuitem" tabindex="-1" href="#">City</a></option>
                            <option value="state" role="presentation"><a role="menuitem" tabindex="-1" href="#">State</a></option>
                            <option value="zipCode" role="presentation"><a role="menuitem" tabindex="-1" href="#">ZipCode</a></option>
                        </select>
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
        </div>

        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>