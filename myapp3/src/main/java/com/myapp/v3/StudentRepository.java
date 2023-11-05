package com.myapp.v3;


import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class StudentRepository {

    public List<Student> getAllStudents() {
        return List.of(
                new Student(1, "Jack k", 1111, "java"),
                new Student(2, "Henry", 2222, "cpp"),
                new Student(3, "Andrew", 3333, "python")
        );
    }


    public int countAllStudents(){
        return getAllStudents().size();
    }

    public Optional<Student> getStudent(int id){
        return getAllStudents().stream().filter(Student -> Student.id == id).findFirst();
    }

}
