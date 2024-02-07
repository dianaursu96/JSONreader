package com.demo.jsonreader;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private String courseName;
    private Trainer trainer;
    private boolean online;
    private List<CourseDay> courseDays;

    // Getters and setters
}
@Data

class Trainer {
    private String name;
    private int zoomId;

    // Getters and setters
}
@Data

class CourseDay {
    private String day;
    private String startingHour;

    // Getters and setters
}
