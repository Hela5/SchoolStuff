<%-- 
    Document   : newContactFormNoAjax
    Created on : May 27, 2015, 9:14:58 AM
    Author     : apprentice
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Company Contacts</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img.icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Company Contacts</h1>
            <hr />
        </div>
        <div class="container">
            <h1>New Contact Form</h1>
            <a href="displayContactListNoAjax">Contact List(No Ajax)</a><br />

            <form class="form-horizontal"
                  role="form"
                  action="addNewContactNoAjax"
                  method="POST">
                <div class="form-group" >
                    <label for="add-firstName" class="col-md-4 control-label">First Name:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-first-name"
                               name="firstName"
                               placeholder="First Name" />
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-lastName" class="col-md-4 control-label">Last Name:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-last-name"
                               name="lastName"
                               placeholder="Last Name" />
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-company" class="col-md-4 control-label">Company Name:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-company"
                               name="company"
                               placeholder="Company" />
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-email" class="col-md-4 control-label">Email:</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-company"
                               name="email"
                               placeholder="example@email.com" />
                    </div>
                </div>
                <div class="form-group" >
                    <label for="add-phone" class="col-md-4 control-label">Phone</label>
                    <div class="col-md-8"> 
                        <input type="text" 
                               class="form-control"
                               id="add-phone"
                               name="phone"
                               placeholder="Phone" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" 
                                id="add-button"
                                class="btn btn-default">Add New Contacts</button>
                    </div>
                </div>
            </form>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>
