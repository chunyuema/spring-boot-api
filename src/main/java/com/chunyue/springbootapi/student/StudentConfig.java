package com.chunyue.springbootapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.JULY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student chunyue = new Student(1L, "chunyuema", "cma01@gmail.com",
                    LocalDate.of(2000, JANUARY, 23));

            Student alex = new Student( "alex", "alogan@gmail.com",
                    LocalDate.of(2004, JULY, 23));
            repository.saveAll(List.of(chunyue, alex));
        };
    }
}
