package com.eduhub.eduhub_backend.Service;

import com.eduhub.eduhub_backend.Component.Students;

import java.util.List;

public interface StudentService {

    List<Students> getAll();

    Students getById(int id);

    Students addStudents(Students students);

    Students updateStudents(int id,Students newStudent);

    String deleteStudents(int id);
}