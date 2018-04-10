<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login page</title>
</head>
<body>
<h1>Login page</h1>
<div id="userInfoForm">
    <label>Login info</label>
    <form method="post" action="/login" name="user">
        <div>
            <label>Username:</label>
            <input name="name" type="text">
        </div>
        <div>
            <label>Password:</label>
            <input name="password" type="password">
        </div>
        <div>
            <a href="/registration">Registration</a>
            <input type="submit" value="Submit">
        </div>
    </form>
</div>

</body>
</html>