package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jose = new Student(
                    "Jose",
                    "joseangelsilva29@outlook.com",
                    LocalDate.of(2000, APRIL, 18)
            );
            Student luis = new Student(
                    "Luis",
                    "joseangelsilva29@gmail.com",
                    LocalDate.of(1990, APRIL, 18)
            );

            repository.saveAll(
                    List.of(jose,luis)
            );

        };
    }
}
