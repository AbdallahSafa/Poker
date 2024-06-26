<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Poker Session Form</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
    <body>
        <div class="container">
            <h2>Poker Session Details</h2>
            <form:form method="post" modelAttribute="game">
                <div class="mb-3">
                    <label class="form-label">Date</label>
                    <form:input path="date" type="date" class="form-control" required="true"/>
                    <form:errors path="date" cssClass="text-danger"/>
                </div>
                <div class="mb-3">
                    <label class="form-label">Buy-In</label>
                    <form:input path="buyIn" type="number" step="0.01" class="form-control" required="true"/>
                    <form:errors path="buyIn" cssClass="text-danger"/>
                </div>
                <div class="mb-3">
                    <label class="form-label">End of Night</label>
                    <form:input path="endNight" type="number" step="0.01" class="form-control" required="true"/>
                    <form:errors path="endNight" cssClass="text-danger"/>
                </div>
                <form:hidden path="id"/>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
    </body>
</html>