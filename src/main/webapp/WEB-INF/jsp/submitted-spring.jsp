<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/sample.css">
</head>
<body>
    <h1>Your request submitted successfully</h1>
    <h2>${message}</h2>
    <h3>Country: ${student.studentCountry}</h3>
    <h4>Favorite Language: ${student.studentFavLanguage}</h4>
    <h5>Operating systems:</h5>
    <ul>
        <c:forEach var="temp" items="${student.studentKnowsOS}">
            <li>${temp}</li>
        </c:forEach>    
    </ul>
    <h6>GPA: ${student.studentGPA}</h6>
    <h6>Zip: ${student.studentZip}</h6>
    <a href="/springform/">SpringHome</a>
</body>
</html>