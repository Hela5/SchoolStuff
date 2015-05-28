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
            <h1>Edit Dvd Form</h1>
            <a href="displayDvdList">Dvd</a><br />

            <sf:form class="form-horizontal"
                     modelAttribute="dvd"
                     role="form"
                     action="editDvdForm"
                     method="POST">
                <div class="form-group" >
                    <label for="add-title" class="col-md-4 control-label">Movie Title:</label>
                    <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-title"
                                  path="title"
                                  placeholder="Title" />
                        <sf:errors path="title" cssClass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-releasedate" class="col-md-4 control-label">Release Date:</label>
                    <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-releasedate"
                                  path="releaseDate"
                                  placeholder="Release Date" />
                        <sf:errors path="releaseDate" cssClass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-mpaa-rating" class="col-md-4 control-label">MPAA Rating:</label>
                    <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-mpaa-rating"
                                  path="mpaaRating"
                                  placeholder="MPAA Rating" />
                        <sf:errors path="mpaaRating" cssClass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-director" class="col-md-4 control-label">Director:</label>
                    <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-director"
                                  path="director"
                                  placeholder="Director's Full Name" />
                        <sf:errors path="director" cssClass="error"></sf:errors>
                        <sf:hidden path="id" />

                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-studio" class="col-md-4 control-label">Studio:</label>
                    <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-studio"
                                  path="studio"
                                  placeholder="studio" />
                        <sf:errors path="studio" cssClass="error"></sf:errors>
                    </div>
                </div>
                    <div class="form-group" >
                        <label for="add-note" class="col-md-4 control-label">Personal Note:</label>
                        <div class="col-md-8"> 
                            <sf:input type="text" 
                                      class="form-control"
                                      id="add-note"
                                      path="note"
                                      placeholder="Note" />
                            <sf:errors path="note" cssClass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" 
                                    id="add-button"
                                    class="btn btn-primary">Submit Edits</button>
                        </div>
                    </div>
                    </sf:form>
                </div>
                <!-- Placed at the end of the document so the pages load faster -->
                <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
                <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

                </body>
                </html>

