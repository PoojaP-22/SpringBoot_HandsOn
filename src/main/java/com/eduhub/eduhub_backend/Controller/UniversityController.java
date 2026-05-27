package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.Component.University;
import com.eduhub.eduhub_backend.Service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/course")
    public ResponseEntity<List<University>> getAllCourse() {
        return ResponseEntity.ok(
                universityService.getAllCourses()
        );
    }

    @GetMapping("/code/{courseCode}")
    public ResponseEntity<University> getCourseByCode(
            @PathVariable int courseCode) {

        return ResponseEntity.ok(
                universityService.getCourseByCode(courseCode)
        );
    }

    @PostMapping("/add")
    public ResponseEntity<University> addCourse(
            @RequestBody University university) {

        return ResponseEntity.ok(
                universityService.addCourse(university)
        );
    }

    @PutMapping("/update/{courseCode}")
    public ResponseEntity<University> updateCourse(
            @PathVariable int courseCode,
            @RequestBody University updatedCourse) {

        return ResponseEntity.ok(
                universityService.updateCourse(
                        courseCode,
                        updatedCourse
                )
        );
    }

    @DeleteMapping("/delete/{courseCode}")
    public ResponseEntity<String> deleteCourse(
            @PathVariable int courseCode) {

        return ResponseEntity.ok(
                universityService.deleteCourse(courseCode)
        );
    }
}