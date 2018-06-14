<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update Room</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body class="container">

<h3>Update Room</h3>
<hr/>

<a href="<s:url value="/room/list"/> " class="btn btn-primary pull-right"><span
        class="glyphicon glyphicon-home"></span> Home</a>
<br/>
<br/>
<s:url value="/room/update" var="saveUrl"/>
<form:form action="${saveUrl}" method="post" modelAttribute="room">
    <form:hidden path="id"/>

    <div class="form-group">
        <label for="roomType">Room Type:</label>
        <form:input path="roomType" class="form-control" id="roomType"/>
    </div>
    <div class="form-group">
        <label for="price">Price:</label>
        <form:input path="price" class="form-control" id="price"/>
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
        <form:input path="location" class="form-control" id="location"/>
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
