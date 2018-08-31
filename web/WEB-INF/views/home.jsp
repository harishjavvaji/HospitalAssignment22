<%--
  Created by IntelliJ IDEA.
  User: sukan
  Date: 8/25/2018
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">Hospital</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/">Home</a></li>

            <li><a href="#">Page 1</a></li>
        </ul>


        <ul class="nav navbar-nav navbar-right">
            <li><a href="/registartion"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <h4>${greeting}</h4>

</div>

<div class="center">
    <div class="container">
        <h3>Welcome!!!</h3>
        <p>Please login or register to view available appointments</p>
    </div>
</div>

</body>
</html>
