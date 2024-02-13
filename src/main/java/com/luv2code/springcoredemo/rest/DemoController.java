package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.TennisCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a  private field for dependency

    private Coach myCoach;

    @Autowired
    public void DemoController(@Qualifier("trackCoach") Coach theCoach) {
        System.out.println("In constructor: "+ getClass().getSimpleName());
        //Error message before giving @Primary annotation to the constructor
        // Action: Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed

                myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
