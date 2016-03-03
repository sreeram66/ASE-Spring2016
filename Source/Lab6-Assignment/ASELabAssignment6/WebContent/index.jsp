<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Area and Perimeter of Square</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Square" />
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<header>
    <h1 class="w100 text-center"><a href="index.html">Area & Perimeter of Square</a></h1>
</header>
<div class="row">
    <div class="col-md-6 col-md-offset-3">
        <form action="#">
        <br><br>
            <p align="center"><input type="text" id="Area" placeholder="enter the side value of a square" autocomplete="off" ></p>
           <br>
            <p align="center"><input type="submit" value="Area" ></p>
            <p align="center"><input type="submit" value="Perimeter"></p>
            <br>
            <p align="center">Perimeter of square is 20</p>
        </form>
        <div id="results"></div>
    </div>
</div>

<!-- scripts -->
<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
<script src="app.js"></script>
<script src="https://apis.google.com/js/client.js?onload=init"></script>
</body>
</html>