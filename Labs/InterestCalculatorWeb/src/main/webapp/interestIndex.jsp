<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 style="text-align: center">Welcome to Your Bank's Interest Calculator!</h1>
        <h4 style="text-align: center">A few questions to set everything up...</h4><br>
        <p style="text-align: center">Enter the Annual Percentage Rate:</p>
        <form style="text-align: center" action="InterestCalculator" method="POST">
            <input type="text" name="percentRate"/>
            <input type="submit" value="PERCENTAGE"/>
        </form>

        <p style="text-align: center">Enter the Amount of Principal:</p>
        <form style="text-align: center" action="InterestCalculator" method="POST">
            <input type="text" name="principal"/>
            <input type="submit" value="PRINCIPAL"/>
        </form>

        <p style="text-align: center">Enter the number of years that the money is to stay in the fund:</p>
        <form style="text-align: center" action="InterestCalculator" method="POST">
            <input type="text" name="years"/>
            <input type="submit" value="YEARS"/>
        </form>

        <p style="text-align: center">Select the kind of compounding interest you would prefer:</p>
        <form style="text-align: center" action="InterestCalculator" method="POST">
            <select name="typeInterest">
                <option value="daily">Daily</option>
                <option value="monthly">Monthly</option>
                <option value="quarterly">Quarterly</option>
            </select><br>
            <input type="submit" value="INTEREST TYPE"/>
        </form>

    </body>
</html>
