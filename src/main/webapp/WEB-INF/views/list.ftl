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
        <td><a href="/user/${user.id}">${user.id}</a></td>
        <td><a href="/user/${user.id}">${user.name}</a></td>
        <td><a href="/user/${user.id}">${user.password}</a></td>
        <td><a href="/update/${user.id}">Edit</a></td>
        <td><a href="/delete/${user.id}">Delete</a></td>
    </tr>
    </#list>
    <tr>
        <td>
            <a href="/create"><label>Create new user</label></a>
        </td>
    </tr>
</table>
</body>
</html>