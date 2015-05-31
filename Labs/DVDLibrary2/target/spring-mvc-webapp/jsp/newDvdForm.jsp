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
            <h1>New Dvd Form</h1>
            <a href="displayDvdlist">Dvd</a><br />

            <form class="form-horizontal"
                  role="form"
                  action="addNewDvd"
                  method="POST">
                <div class="form-group" >
                    <label for="add-title" class="col-md-4 control-label">Movie Title:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-title"
                               name="title"
                               placeholder="Title" />
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-releasedate" class="col-md-4 control-label">Release Date:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-releasedate"
                               name="releaseDate"
                               placeholder="Release Date" />
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-mpaa-rating" class="col-md-4 control-label">MPAA Rating:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-mpaa-rating"
                               name="mpaaRating"
                               placeholder="MPAA Rating" />
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-director" class="col-md-4 control-label">Director:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-director"
                               name="director"
                               placeholder="Director's Full Name" />
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-studio" class="col-md-4 control-label">Studio:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-studio"
                               name="studio"
                               placeholder="studio" />
                    </div>
                </div>
                    <div class="form-group" >
                        <label for="add-note" class="col-md-4 control-label">Personal Note:</label>
                        <div class="col-md-8"> 
                            <input type="text" 
                                   class="form-control"
                                   id="add-note"
                                   name="note"
                                   placeholder="Note" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" 
                                    id="add-button"
                                    class="btn btn-primary">Add New Dvd</button>
                        </div>
                    </div>
            </form>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

