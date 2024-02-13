package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }
}
