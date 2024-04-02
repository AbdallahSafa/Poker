package org.example.igogym.workout;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WorkoutController {

    private WorkoutService workoutService;

    @Autowired
    public WorkoutController(WorkoutService workoutService) {
        super();
        this.workoutService = workoutService;
    }

    @RequestMapping("list-workouts")
    public String listWorkouts(ModelMap model) {
        List<Workout> workouts = workoutService.findByUser("safa");
        model.addAttribute("workouts", workouts);
        return "listworkouts";
    }
}
