<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 6/8/18
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Room</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body class="container">

<h3>Add Rooms</h3>
<hr/>

<a href="<s:url value="/welcome"/> " class="btn btn-primary pull-right"><span
        class="glyphicon glyphicon-home"></span> Home</a>
<br/>
<br/>

<s:url value="/room/save" var="saveUrl"/>
<form:form action="${saveUrl}" method="post" modelAttribute="room">
    <form:hidden path="id"/>

    <div class="form-group">
        <label for="roomType">Room Type:</label>
        <form:input path="roomType" class="form-control" id="roomType" required="required"/>
    </div>
    <div class="form-group">
        <label for="price">Price:</label>
        <form:input path="price" class="form-control" id="price" required="required"/>
    </div>
    <div class="form-group">
        <label for="image">Image:</label>
        <form:input path="image" class="form-control" id="image"/>
    </div>
    <div class="form-group">
        <label for="description">Description:</label>
        <form:input path="description" class="form-control" id="description"/>
    </div>
    <div class="form-group">
        <label for="location">Location:</label>
        <form:input path="location" class="form-control" id="location" required="required"/>
    </div>
    <div class="form-group">
        <label for="facilities">Facilities:</label>
        <form:input path="facilities" class="form-control" id="facilities"/>
    </div>

    <br/>
    <button type="submit" class="btn btn-default">Submit</button>
</form:form>

</body>
</html>