<%--
  Created by IntelliJ IDEA.
  User: edu.jft.prashant
  Date: 20/7/13
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="e" uri="http://jakarta.apache.org/taglibs/standard/scriptfree" %>

<html>
<head>
    <title>Spring MVC Home</title>
    <link rel="stylesheet" type="text/css" href='<s:url value="resources/css/bootstrap.min.css"/>' >
    <style>
        .footer{
            text-align: center;
            bottom: 0;
            position: fixed;
            width: 100%;
        }
    </style>
</head>
<body>
<div class="navbar">
    <div class="navbar-inner">
        <div class="text-center">
            <h4 class="pull-left">Prashant Gupta</h4>
            <ul class="nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">Blog</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="span2">

    </div>
    <div class="span10">
        <div class="text-center">
            <h5>Website Under Construction</h5>
            ${spittles}
        </div>
    </div>
</div>

<footer class="footer modal-footer">
    <div class="row-fluid">
        <div class="span1">

        </div>
        <div class="span8">
            Prashant Gupta &copy; 2013 <br/>
            Software Engineer, India.
        </div>
        <div class="span1">

        </div>
    </div>
</footer>
</body>
</html>