<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search result page</title>
</head>
<body>
<h1>Search result page</h1>
<div>
    <div>
        <form method="get" action="/search-result" name="user" >
            <div>
                <label>Id: </label>
                <label>${user.id}</label>
            </div>
            <div>
                <label>Username: </label>
                <label>${user.name}</label>
            </div>
            <div>
                <label>Password: </label>
                <label>${user.password}</label>
            </div>
        </form>
    </div>
    <div>
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Class</th>
                <th>Level</th>
                <th>Health</th>
                <th>Speed</th>
                <th>Attack</th>
                <th>Defence</th>
                <th>Buff</th>
            </tr>
    <#list characters as character>
    <tr>
        <td>${character.id}</td>
        <td>${character.name}</td>
        <td>${character.className}</td>
        <td>${character.level}</td>
        <td>${character.healthMax}</td>
        <td>${character.speed}</td>
        <td>${character.attackLevel}</td>
        <td>${character.defenceLevel}</td>
        <td>${character.buffLevel}</td>
    </tr>
    </#list>
        </table>
        <div>
            <a href="/user/${user.id}/character-creation"><label>Create new character</label></a>
        </div>
    </div>

</div>

</body>
</html>