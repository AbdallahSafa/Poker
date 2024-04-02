<!DOCTYPE html>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <title>iGoGym - Workout Tracker</title>
</head>
<body>

<header>
    <h1>Welcome to iGoGym</h1>
    <h2> ${name} </h2>
    <p>Your personal workout tracker.</p>
</header>

<!-- Form for adding a new workout -->
<section id="addWorkout">
    <h2>Add a New Workout</h2>
    <form action="AddWorkoutServlet" method="post"> <!-- Assuming you have a servlet handling the form submission -->
        <label for="workoutName">Workout Name:</label>
        <input type="text" id="workoutName" name="workoutName" required>

        <label for="workoutDate">Date:</label>
        <input type="date" id="workoutDate" name="workoutDate" required>

        <label for="workoutDuration">Duration (in minutes):</label>
        <input type="number" id="workoutDuration" name="workoutDuration" required>

        <button type="submit">Add Workout</button>
    </form>
</section>

<!-- Section for listing workouts -->
<section id="workoutList">
    <h2>Your Workouts</h2>
    <ul>
<%--        &lt;%&ndash; Placeholder for dynamic content &ndash;%&gt;--%>
<%--        <%--%>
<%--            List<Workout> workouts = (List<Workout>)request.getAttribute("workouts");--%>
<%--            if (workouts != null) {--%>
<%--                for (Workout workout : workouts) {--%>
<%--                    out.println("<li>" + workout.getName() + " - " + workout.getDate() + " - " + workout.getDuration() + " minutes</li>");--%>
<%--                }--%>
<%--            }--%>
<%--        %>--%>
    </ul>
</section>

</body>
</html>
