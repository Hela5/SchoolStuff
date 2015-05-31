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
            <h1>Edit Address Form</h1>
            <hr/>
            <a href="displayAddList">Address</a>

            <sf:form class="form-horizontal"
                     modelAttribute="address"
                     role="form"
                     action="editAddForm"
                     method="POST">
                <div class="form-group">
                    <label for="add-first-name" class="col-md-4 control-label">First Name:</label>
                    <div class="col-md-8">
                        <sf:input type="text"
                                  class="form-control"
                                  id="add-first-name"
                                  path="firstName"
                                  placeholder="First Name" />
                        <sf:errors path="firstName" cssClass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-last-name" class="col-md-4 control-label">Last Name:</label>
                        <div class="col-md-8">
                        <sf:input type="text"
                                  class="form-control"
                                  id="add-last-name"
                                  path="lastName"
                                  placeholder="Last Name" />
                        <sf:errors path="lastName" cssClass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-street-address" class="col-md-4 control-label">Street Address:</label>
                        <div class="col-md-8">
                        <sf:input type="text"
                                  class="form-control"
                                  id="add-street-address"
                                  path="streetAddress"
                                  placeholder="Street Address" />
                        <sf:errors path="streetAddress" cssClass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-city" class="col-md-4 control-label">City:</label>
                        <div class="col-md-8">
                        <sf:input type="text"
                                  class="form-control"
                                  id="add-city"
                                  path="city"
                                  placeholder="City" />
                        <sf:errors path="city" cssClass="error"></sf:errors>
                        <sf:hidden path="iD" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-state" class="col-md-4 control-label">State:</label>
                        <div class="col-md-8">
                        <sf:input type="text"
                                  class="form-control"
                                  id="add-state"
                                  path="state"
                                  placeholder="State" />
                        <sf:errors path="state" cssClass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-zipcode" class="col-md-4 control-label">ZipCode:</label>
                        <div class="col-md-8">
                        <sf:input type="text"
                                  class="form-control"
                                  id="add-zipcode"
                                  path="zipCode"
                                  placeholder="ZipCode" />
                        <sf:errors path="zipCode" cssClass="error"></sf:errors>
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

