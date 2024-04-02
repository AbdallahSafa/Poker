package org.example.igogym.workout;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WorkoutService {


    private static List<Workout> workouts = new ArrayList<>(); ;
    static{
        List<String> exercises = Arrays.asList("pushups","pullups");
        workouts.add(new Workout(exercises, LocalDate.now(), 1, "Poker Face",
                "safa","push"));
    }

    public List<Workout> findByUser(String username){
        return workouts;
    }

}


