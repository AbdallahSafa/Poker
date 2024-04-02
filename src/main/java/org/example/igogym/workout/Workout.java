package org.example.igogym.workout;


import java.time.LocalDate;
import java.util.List;

public class Workout {
    private LocalDate workoutDate;
    private int id;
    private String favSong;
    private List<String> exercises;
    private String username;
    private String workoutName;

    public Workout(List<String> exercises, LocalDate workoutDate, int id, String favSong, String username, String workoutName) {
        this.exercises = exercises;
        this.workoutDate = workoutDate;
        this.id = id;
        this.favSong = favSong;
        this.username = username;
        this.workoutName = workoutName;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "workoutDate=" + workoutDate +
                ", id=" + id +
                ", favSong='" + favSong + '\'' +
                ", exercises=" + exercises +
                ", username='" + username + '\'' +
                ", workoutName='" + workoutName + '\'' +
                '}';
    }

    public LocalDate getWorkoutDate() {
        return workoutDate;
    }

    public void setWorkoutDate(LocalDate workoutDate) {
        this.workoutDate = workoutDate;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFavSong() {
        return favSong;
    }

    public void setFavSong(String favSong) {
        this.favSong = favSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public void setExercises(List<String> exercises) {
        this.exercises = exercises;
    }
}
