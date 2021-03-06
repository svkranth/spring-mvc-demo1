<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
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
    <form:form action="ProcessForm" modelAttribute="student">
        What is your name?(*) <form:input path="studentName"/>
        <form:errors path="studentName" cssClass="error" />
        <br>
        Select your Gender(*):
        <form:select path="studentGender">
            <form:option value="M" label="Male"/>
            <form:option value="F" label="Female"/>
            <form:option value="U" label="Not sprecified"/>
        </form:select>
        <form:errors path="studentGender" cssClass="error"/>
        <br>
        Select your Country(*):
        <form:select path="studentCountry">
            <form:options items="${student.studentCountryList}"/>
        </form:select>
        <form:errors path="studentCountry" cssClass="error"/>
        <br>
        Select your Favorite programming Language(*):
        <br>
        Java <form:radiobutton path="studentFavLanguage" value="Java"/>
        COBOL <form:radiobutton path="studentFavLanguage" value="COBOL"/>
        Java script <form:radiobutton path="studentFavLanguage" value="Java script"/>
        <form:errors path="studentFavLanguage" cssClass="error"/>
        <br>
        Select all the Operating systems you know(*):
        <br>
        Linux <form:checkbox path="studentKnowsOS" value="Linux"/>
        Windows <form:checkbox path="studentKnowsOS" value="Windows"/>
        MAC OS <form:checkbox path="studentKnowsOS" value="MAC OS"/>
        Z/os <form:checkbox path="studentKnowsOS" value="Z/os"/>
        <form:errors path="studentKnowsOS" cssClass="error"/>
        <br>
        Enter your GPA(*): <form:input path="studentGPA"/>
        <form:errors path="studentGPA" cssClass="error"/>
        <br>
        Enter your Zip code(*): <form:input path="studentZip"/>
        <form:errors path="studentZip" cssClass="error"/>
        <br>
        <button type="submit">submit</button>
    </form:form>
</body>
</html>