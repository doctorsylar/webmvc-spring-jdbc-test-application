<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Character creation</title>
</head>
<body>
<h1>Create new character</h1>

<form method="post" action="/user/${id}/character-creation" name="character">
    <div>
        <div>
            <label>Character name:</label>
            <input type="text" name="name" >
        </div>
        <div>
            <label>Class:</label>
            <input type="text" name="className">
            <label>WaterMage | FireMage | EarthMage | WindMage</label>
        </div>
        <div>
            <label>Attack level:</label>
            <input type="text" name="attackLevel" >
            <label>1-3</label>
        </div>
        <div>
            <label>Defence level:</label>
            <input type="text" name="defenceLevel" >
            <label>1-3 && def <= attack</label>
        </div>
        <div>
            <label>Buff level:</label>
            <input type="text" name="buffLevel" >
            <label>1-3 && buff <= def</label>
        </div>
        <div>
            <label>Speed level:</label>
            <input type="text" name="speed" >
            <label>3-6</label>
        </div>
        <div>
            <input type="submit" value="Submit">
        </div>
    </div>
</form>

</body>
</html>