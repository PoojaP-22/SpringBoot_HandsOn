package com.eduhub.eduhub_backend.Service;

import com.eduhub.eduhub_backend.Component.University;
import com.eduhub.eduhub_backend.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityService {

    private static List<University> courseList = new ArrayList<>();

    static {
        courseList.add(new University(101, "Java", 4));
        courseList.add(new University(102, "Python", 3));
        courseList.add(new University(103, "DBMS", 4));
        courseList.add(new University(104, "Spring Boot", 5));
        courseList.add(new University(105, "Data Structures", 4));
    }

    // Get all courses
    public List<University> getAllCourses() {
        return courseList;
    }

    // Get course by code
    public University getCourseByCode(int courseCode) {

        for (University course : courseList) {

            if (course.getId() == courseCode) {
                return course;
            }
        }

        throw new ResourceNotFoundException(
                "Course",
                "courseCode",
                String.valueOf(courseCode)
        );
    }

    // Add course
    public University addCourse(University university) {

        courseList.add(university);

        return university;
    }

    // Update course
    public University updateCourse(
            int courseCode,
            University updatedCourse) {

        for (University course : courseList) {

            if (course.getId() == courseCode) {

                course.setName(updatedCourse.getName());
                course.setCredit(updatedCourse.getCredit());

                return course;
            }
        }

        throw new ResourceNotFoundException(
                "Course",
                "courseCode",
                String.valueOf(courseCode)
        );
    }

    // Delete course
    public String deleteCourse(int courseCode) {

        University foundCourse = null;

        for (University course : courseList) {

            if (course.getId() == courseCode) {
                foundCourse = course;
                break;
            }
        }

        if (foundCourse != null) {

            courseList.remove(foundCourse);

            return "Course Deleted Successfully";
        }

        throw new ResourceNotFoundException(
                "Course",
                "courseCode",
                String.valueOf(courseCode)
        );
    }
}

