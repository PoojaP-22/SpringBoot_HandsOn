package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.Component.CourseService;
import com.eduhub.eduhub_backend.Component.ProductService;

import org.springframework.beans.factory.annotation.Autowired;

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

}
