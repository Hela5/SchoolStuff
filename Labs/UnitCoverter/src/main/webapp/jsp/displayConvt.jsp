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
            <h1>Unit Converter</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/displayConvt">Converter</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/convtResults">Conversions</a></li>

                </ul>    
            </div>
            <h2></h2>
            <form> 
                <div class="form-inline">
                    <label for=inputTemp">Temperature</label>
                    <input type="temp" class="form-control" id="input temp" placeholder="Enter degrees">
                </div>
            </form>
            <div class="row">
                <div class="col-md-2">
                    <div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
                            Convert From:
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Celsius</a></li>
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Farenheit</a></li>
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Kelvin</a></li>
                        </ul>  
                    </div>
                </div>
                <div class="col-md-2">

                    <div class="dropdown">

                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-expanded="true">
                            Convert To:
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu2">
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Celsius</a></li>
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Farenheit</a></li>
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Kelvin</a></li>
                        </ul>    
                    </div>
                </div>
                <div class="col-md-8"><hr></div>
            </div>
        </div>

        <form> 
            <div class="form-inline">
                <label for=inputTemp">Currency</label>
                <input type="money" class="form-control" id="input monet" placeholder="Enter Amount">
            </div>
        </form>
        <div class="row">
            <div class="col-md-2">
                <div class="dropdown">
                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
                        Convert From:
                        <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">US Dollar</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Euro</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Colombian Peso</a></li>
                    </ul>  
                </div>
            </div>
            <div class="col-md-2">
                <div class="dropdown">
                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-expanded="true">
                        Convert To:
                        <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu2">
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">US Dollar</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Euro</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Colombian Peso</a></li>
                    </ul>    
                </div>
            </div>
            <div class="col-md-8"><hr></div>
        </div>
    </div>

    <form> 
        <div class="form-inline">
            <label for=inputTemp">Length</label>
            <input type="length" class="form-control" id="input length" placeholder="Enter Length">
        </div>
    </form>
    <div class="col-md-2">
        <div class="dropdown">
            <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
                Convert From:
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Inches</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Centimeters</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Feet</a></li>
            </ul>  
        </div>
    </div>
    <div class="col-md-2">
        <div class="dropdown">
            <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-expanded="true">
                Convert To:
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu2">
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Inches</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Centimeters</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Feet</a></li>
            </ul>    
        </div>
    </div>
    <div class="col-md-8"><hr></div>
</div>

<form> 
    <div class="form-inline">
        <label for=inputTemp">Weights</label>
        <input type="weight" class="form-control" id="input weight" placeholder="Enter weight">
    </div>
</form>
<div class="col-md-2">
    <div class="dropdown">
        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
            Convert From:
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Ounces</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Pounds</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Kilograms</a></li>
        </ul>  
    </div>
</div>
<div class="col-md-2">

    <div class="dropdown">

        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-expanded="true">
            Convert To:
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu2">
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Ounces</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Pounds</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Kilograms</a></li>
        </ul>    
    </div>
</div>
</div>



</div>
<!-- Placed at the end of the document so the pages load faster -->
<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</body>
</html>

