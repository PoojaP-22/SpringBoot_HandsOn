package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.Component.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/get")
public class StudentController {

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

    @GetMapping("{id}/{firstName}/{lastName}")
    public ResponseEntity<Student> studentPathVariable(
            @PathVariable("id") int studentId,
            @PathVariable("firstName") String firstName,
            @PathVariable("lastName") String lastName) {

        Student student = new Student(studentId, firstName, lastName);

        return ResponseEntity.ok(student);
    }

    @GetMapping("query")
    public ResponseEntity<Student> StudentRepositoryQuery(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName){
        Student student = new Student(id, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);
    }


//    @PutMapping("/update")
//    public ResponseEntity<String> updateStudent(){
//        return ResponseEntity.accepted().body("Not Found");
//    }

    @PutMapping ("{id}/update")
    public ResponseEntity<Student> updateStudent(
            @PathVariable("id") int studentId,
            @RequestBody Student student) {
        return ResponseEntity.accepted().body(student);
    }

    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(
            @PathVariable("id") int studentId){
        return ResponseEntity.accepted().body("Data removed successfully");
    }

}
