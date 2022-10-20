package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student marium=new Student(
                    "marium",
                    "marrium.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21

            );
            Student james=new Student(
                    "james",
                    "james@gmail.com",
                    LocalDate.of(2003, JANUARY, 5),
                    21

            );

            repository.saveAll(
                    List.of(marium,james)
            );
        };
    }

}
