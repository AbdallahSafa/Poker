<html lang="en">
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title>Welcome</title>
    </head>

    <body>
        <%@include file="common/navigation.jspf"%>
        <div class = "welcome-container">
            <h1>Welcome ${name}</h1>
             <div><a href = "list-poker-games"> Manage</a> Sessions </div>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
    </body>
</html>
