<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 style="text-align: center">Welcome to the Lucky 7's Game Page!</h1>
        <p style="text-align: center">
            How much money would you like to begin betting with?
        </p>
        <form style="text-align: center" action="LuckyController" method="POST">
            <input type="text" name="money"/>
            <input type="submit" value="AMOUNT"/>

        </form>
    </body>
</html>
