<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>I'm having a Parrrty! You're Invited!!</h1>
        <p>
            Can you attend?
        </p>
        <form action="RSVPController" method="POST">
            <input type="text" name="answer"/><br>
            <select name="reason">
                <option value="Out of Town">I'm going to be out of town</option>
                <option value="Schedule Conflict">I have a previous engagement</option>
                <option value="I don't like You">I simply don't like you.</option>
            </select><br>
            <input type="submit" value="RSVP"/>
        </form>
    </body>
</html>
