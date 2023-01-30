<%-- 
    Document   : agecalculator
    Created on : Jan 30, 2023, 3:13:36 AM
    Author     : azriee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="post" action="age">
            <h1>Age Calculator</h1>
            Enter your age: <input type="text" name="age""><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
            <a href="/Week3Lab_Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
