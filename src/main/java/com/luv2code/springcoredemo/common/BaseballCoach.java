package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component //Marks the class as a Spring bean, allow to implement dependency injection
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice.";
    }
}
