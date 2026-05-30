package com.eduhub.eduhub_backend.Controller;


import com.eduhub.eduhub_backend.Component.Students;
import com.eduhub.eduhub_backend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentService students;

    @GetMapping("/all")
    public ResponseEntity<List<Students>> getALl(){
        return ResponseEntity.ok(students.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Students> getAllById(@PathVariable int id){
        return ResponseEntity.ok(students.getById(id));
    }

    @PostMapping("/new")
    public ResponseEntity<Students> createS(@RequestBody Students s){
        return ResponseEntity.ok(students.addStudents(s));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Students> updateS(@PathVariable int id,@RequestBody Students newS){
        return ResponseEntity.ok(students.updateStudents(id,newS));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteS(@PathVariable int id){
        return ResponseEntity.ok(students.deleteStudents(id));
    }
}
