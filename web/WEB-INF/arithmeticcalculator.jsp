<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 30, 2023, 4:07:24 AM
    Author     : azriee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form method="post" action="age">
            <h1>Arithmetic Calculator</h1>
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
        <a href="/Week3Lab_Calculators/age">Age Calculator</a>
    </body>
</html>