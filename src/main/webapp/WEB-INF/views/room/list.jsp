<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 6/8/18
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Room</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body class="container">
<h3>List of Rooms</h3>
<hr />

<a href="<c:url value="/room/add" />" class="btn btn-success pull-right"><span class="glyphicon glyphicon-plus"></span> Add </a>
<br />
<br />
<table class="table table-striped table-bordered">

    <thead>
    <tr>
        <th>Room Type</th>
        <th>Price</th>
        <th>Image</th>
        <th>Description</th>
        <th>Location</th>
        <th>Facilities</th>
        <th>Action</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="c" items="${roomList}">
        <tr>
            <td>${c.roomType}</td>
            <td>${c.price}</td>
            <td>${c.image}</td>
            <td>${c.description}</td>
            <td>${c.location}</td>
            <td>${c.facilities}</td>

            <td>
                <a href="<c:url value="/room/update/${c.id}"/>" class="btn btn-success btn-sm"><span class="glyphicon glyphicon-pencil"></span> Edit </a>
                <a href="<c:url value="/room/delete/${c.id}"/>" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure?')"><span class="glyphicon glyphicon-trash"></span> Delete </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>

</body>
</html>