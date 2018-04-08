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
        <form method="get" action="/search-result" name="user">
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
</div>

</body>
</html>