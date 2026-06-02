package com.eduhub.eduhub_backend.Service;

import com.eduhub.eduhub_backend.Component.Students;
import com.eduhub.eduhub_backend.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsServiceImpl implements StudentService{  //Loose Coupling
    public static List<Students> sList= new ArrayList<>();

    static{
        sList.add(new Students(16,"Nithish S","AIDS",8.7));
        sList.add(new Students(17,"Pooja P","CSE",8.2));
        sList.add(new Students(18,"Gabby","EEE",7.4));
    }

    //GetAll
    @Override
    public List<Students> getAll(){
        return sList;
    }

    //By ID
    @Override
    public Students getById(int id){
        for(Students s : sList){
            if(s.getId() == id){
                return s;
            }
        }
    throw new ResourceNotFoundException("Students","id",String.valueOf(id));
    }

    //Create
    @Override
    public Students addStudents(Students students){
        sList.add(students);
        return students;
    }

    //Update
    @Override
    public Students updateStudents(int id,Students newStudent){
        for(Students s:sList){
            if(s.getId() == id){
                s.setName(newStudent.getName());
                s.setDepartment(newStudent.getDepartment());
                s.setCgpa(newStudent.getCgpa());
                return s;
            }
        }
        throw new ResourceNotFoundException("Students","id",String.valueOf(id));
    }

    //Delete
    @Override
    public String deleteStudents(int id){
        Students found = null;
        for(Students s : sList){
            if(s.getId() == id){
                found = s;
                break;
            }
        }
        if(found != null){
            sList.remove(found);
            return "The Student data Deleted Successfully";
        }
        throw new ResourceNotFoundException("Students","id",String.valueOf(id));
    }

}
