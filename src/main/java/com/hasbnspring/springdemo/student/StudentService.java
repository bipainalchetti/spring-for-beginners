package com.hasbnspring.springdemo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(new Student(
                        "Advik",
                        "Alchetti",
                        LocalDate.now(),
                        "advik.alchetti@gmail.com",
                        7
                ),
                new Student(
                        "Ashvini",
                        "Alchetti",
                        LocalDate.now(),
                        "ashvini.alchetti@gmail.com",
                        32
                )

        );
    }
}
