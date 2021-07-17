package com.chunyue.springbootapi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L, "chunyuema", "cma01@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 23),
                        21)
        );
    }
}
