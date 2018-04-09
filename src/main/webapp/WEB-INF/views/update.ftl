<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Search result page</title>
</head>
<body>
<h1>Edit page</h1>
<div>
    <div>
        <form method="post" action="/updateUser" name="user">
            <div>
                <div>
                    <label>Id: </label>
                    <label>${user.id}</label>
                    <input type="hidden" name="id" value="${user.id}">
                </div>
                <div>
                    <label>Username: </label>
                    <input type="text" placeholder="${user.name}" name="name">
                <#--<label>${user.name}</label>-->
                </div>
                <div>
                    <label>Password: </label>
                    <input type="text" placeholder="${user.password}" name="password">
                <#--<label>${user.password}</label>-->
                </div>
                <input type="submit" value="Submit">
            </div>
        </form>
    </div>
</div>

</body>
</html>