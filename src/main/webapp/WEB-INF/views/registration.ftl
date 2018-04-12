<#{.data_model.JspTaglibs.['http://www.springframework.org/tags/form']}
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link rel="stylesheet" href="../../resources/css/main.css" type="text/css">
</head>
<body>
<div id="userInfoForm">
    <label>Registration info</label>
    <form method="post" action="/registration" name="user">
        <div>
            <label>Username:</label>
            <input name="name" type="text">
        </div>
        <div>
            <label>Password:</label>
            <input name="password" type="text">
        </div>
        <div>
            <input type="submit" value="Submit">
        </div>
    </form>
</div>

</body>
</html>