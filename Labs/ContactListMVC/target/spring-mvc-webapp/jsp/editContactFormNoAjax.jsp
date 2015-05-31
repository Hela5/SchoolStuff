<%-- 
    Document   : newContactFormNoAjax
    Created on : May 27, 2015, 9:14:58 AM
    Author     : apprentice
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Edit Contact</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img.icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Company Contacts</h1>
            <hr />
        </div>
        <div class="container">
            <h1>Edit Contact Form</h1>
            <a href="displayContactListNoAjax">Contact List(No Ajax)</a><br />

            <sf:form class="form-horizontal"
                     modelAttribute="contact"
                     role="form"
                     action="editContactNoAjax"
                     method="POST">
                <div class="form-group" >
                    <label for="add-firstName" class="col-md-4 control-label">First Name:</label>
                    <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-first-name"
                                  path="firstName"
                                  placeholder="First Name" />
                        <sf:errors path="firstName" cssClass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label for="add-lastName" class="col-md-4 control-label">Last Name:</label>
                        <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-last-name"
                                  path="lastName"
                                  placeholder="Last Name" />
                        <sf:errors path="lastName" cssClass="error"></sf:errors>

                        </div>
                    </div>
                    <div class="form-group" >
                        <label for="add-company" class="col-md-4 control-label">Company Name:</label>
                        <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-company"
                                  path="company"
                                  placeholder="Company" />
                        <sf:errors path="company" cssClass="error"></sf:errors>

                        </div>
                    </div>
                    <div class="form-group" >
                        <label for="add-email" class="col-md-4 control-label">Email:</label>
                        <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-company"
                                  path="email"
                                  placeholder="example@email.com" />
                        <sf:errors path="email" cssClass="error"></sf:errors>

                        </div>
                    </div>
                    <div class="form-group" >
                        <label for="add-phone" class="col-md-4 control-label">Phone:</label>
                        <div class="col-md-8"> 
                        <sf:input type="text" 
                                  class="form-control"
                                  id="add-phone"
                                  path="phone"
                                  placeholder="Phone" />
                        <sf:errors path="phone" cssClass="error"></sf:errors>

                        <sf:hidden path="contactId" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" 
                                id="add-button"
                                class="btn btn-default">Edit Contact</button>
                    </div>
                </div>
            </sf:form>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>
