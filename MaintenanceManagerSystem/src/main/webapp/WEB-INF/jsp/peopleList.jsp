<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <title>People List</title>
</head>
<body>
<h1>People List</h1>

<br>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <c:forEach items="${people}" var="person">
        <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>