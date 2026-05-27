package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.Component.University;
import com.eduhub.eduhub_backend.Exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UniversityController {

    static List<University> courseList = new ArrayList<>();

    static {
        courseList.add(new University(101, "Java", 4));
        courseList.add(new University(102, "Python", 3));
        courseList.add(new University(103, "DBMS", 4));
        courseList.add(new University(104, "Spring Boot", 5));
        courseList.add(new University(105, "Data Structures", 4));
    }

    // Get all Course
    @GetMapping("/course")
    public ResponseEntity<List<University>> getAllCourse(){

        return ResponseEntity.ok(courseList);
    }

    // Get Course using PathVariable
    @GetMapping("/code/{courseCode}")
    public ResponseEntity<?> getCourseByCode(@PathVariable int courseCode) {

        for (University course : courseList) {
            if (course.getId() == courseCode) {
                return ResponseEntity.ok(course);
            }
        }

        return ResponseEntity.badRequest().body("Course not found");
    }

    // Get Course using RequestParam
    @GetMapping("/search")
    public ResponseEntity<?> getCourseByRequestParam(@RequestParam int code) {

        for (University course : courseList) {
            if (course.getId() == code) {
                return ResponseEntity.ok(course);
            }
        }

        return ResponseEntity.badRequest().body("Course not found");
    }

    // Add New Course
    @PostMapping("/add")
    public ResponseEntity<String> addCourse(@RequestBody University university) {

        courseList.add(university);

        return ResponseEntity.ok("Course Added Successfully");
    }

    // Update Course
    @PutMapping("/update/{courseCode}")
    public ResponseEntity<?> updateCourse(
            @PathVariable int courseCode,
            @RequestBody University updatedCourse) {

        for (University course : courseList) {

            if (course.getId() == courseCode) {

                course.setName(updatedCourse.getName());
                course.setCredit(updatedCourse.getCredit());

                return ResponseEntity.ok(course);
            }
        }

        return ResponseEntity.badRequest().body("Course not found");
    }

    // Delete Course
    @DeleteMapping("/delete/{courseCode}")
    public ResponseEntity<String> deleteCourse(@PathVariable int courseCode) {

        for (University course : courseList) {

            if (course.getId() == courseCode) {

                courseList.remove(course);

                return ResponseEntity.ok("Course Deleted Successfully");
            }
        }

        return ResponseEntity.badRequest().body("Course not found");
    }


    @GetMapping("/test-exception")
    public String testException() {

        throw new ResourceNotFoundException(
                "Course",
                "courseCode",
                "999"
        );
    }
    
}
