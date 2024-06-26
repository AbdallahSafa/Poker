<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>

<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Poker Manager</title>
</head>

<body>
<div class="container">
    <h1>Welcome ${name}</h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>date</th>
            <th>id</th>
            <th>username</th>
            <th>buy-in</th>
            <th>end of night</th>
            <th>net of night</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${game}" var="pokerGame">
            <tr>
                <td>${pokerGame.date}</td>
                <td>${pokerGame.id}</td>
                <td>${pokerGame.username}</td>
                <td>${pokerGame.buyIn}</td>
                <td>${pokerGame.endNight}</td>
                <td>${pokerGame.netNight}</td>
                <td> <a href = "delete?id=${pokerGame.id}" class = "btn btn-warning"> Delete</a> <td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href = "add-session" class = "btn btn-success">Add a Session</a>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>

</html>