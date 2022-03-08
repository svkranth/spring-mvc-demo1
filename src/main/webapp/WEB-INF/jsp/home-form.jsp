<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/sample.css">
</head>
<body>
    <h1>Hello there</h1>
    <form action="ProcessForm" method="get">
        <input type="text" name="studentname" placeholder="What is your name?">
        <label for="gender">Select your Gender:</label>
        <select name="gender" id="gender">
            <option value="M">Male</option>
            <option value="F">Female</option>
            <option value="U">Not sprecified</option>
        </select>
        <button type="submit">submit</button>
    </form>
</body>
</html>