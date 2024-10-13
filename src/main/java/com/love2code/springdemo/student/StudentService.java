package com.love2code.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Sathya",
                        "Priya",
                        LocalDate.now(),
                        "contact@sathya.com",
                        34
                ),
                new Student(
                        "Siddeesh",
                        "Anand",
                        LocalDate.now(),
                        "contact@anand.com",
                        35
                )
        );
    }
}
