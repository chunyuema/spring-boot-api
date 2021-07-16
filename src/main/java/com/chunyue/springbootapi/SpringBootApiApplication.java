package com.chunyue.springbootapi;

import com.chunyue.springbootapi.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiApplication.class, args);
    }

//	@GetMapping
//	public String hello(){
//		return "Hello World";
//	}

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(1L,
                        "Chunyue",
                        "cma01@gmail",
                        LocalDate.of(1998, Month.APRIL, 4),
                        22)
        );
    }
}
