<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
<h1>Create new user</h1>

<form method="post" action="/createUser" name="user">
    <div>
        <div>
            <label>Username:</label>
            <input type="text" name="name" >
        </div>
        <div>
            <label>Password:</label>
            <input type="text" name="password">
        </div>
        <div>
            <input type="submit" value="Submit">
        </div>
    </div>
</form>

</body>
</html>