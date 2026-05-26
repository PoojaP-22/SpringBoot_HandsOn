package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.Component.CourseService;
import com.eduhub.eduhub_backend.Component.ProductService;
import com.eduhub.eduhub_backend.Component.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/get")
public class HomeController {
    @Autowired
    CourseService course;
    @Autowired
    ProductService product;

// Constructor Injection

//    private final CourseService course;
//    private final ProductService product;
//
//    public HomeController(CourseService course, ProductService product) {
//    this.course = course;
//    this.product = product;
//     }

    @GetMapping("/course")
    public String getCourse(){

        return course.getCourse();
    }

    @GetMapping("/product")
    public String getProduct(){

        return product.getProduct();
    }

    @GetMapping("/student")
    public ResponseEntity<?> getStudent(){
        Student student = new Student(1,"Pooja","P");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Pooja", "P"));
        students.add(new Student(2, "Nithish", "S"));
        students.add(new Student(3, "Aaaa", "R"));
        students.add(new Student(4, "BBBB", "B"));
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

}
