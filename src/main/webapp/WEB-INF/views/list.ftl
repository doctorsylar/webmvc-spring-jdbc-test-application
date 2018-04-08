<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Homepage</title>
</head>
<body>
<h1>
    List of users
</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Password</th>
    </tr>
    <#list users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.password}</td>
    </tr>
    </#list>
</table>
</body>
</html>