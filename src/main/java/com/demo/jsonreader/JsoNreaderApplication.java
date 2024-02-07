package com.demo.jsonreader;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class JsoNreaderApplication {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Read JSON file and convert to array of Java objects
            Course[] courses = objectMapper.readValue(new File("course.json"), Course[].class);

            // Now you can use the 'courses' array
            for (Course course : courses) {
                System.out.println("Course Name: " + course.getCourseName());
                System.out.println("Trainer Name: " + course.getTrainer().getName());
                System.out.println("Online: " + course.isOnline());
                System.out.println("Course Days:");
                for (CourseDay day : course.getCourseDays()) {
                    System.out.println("- " + day.getDay() + " at " + day.getStartingHour());
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


           SpringApplication.run(JsoNreaderApplication.class, args);
    }

}
