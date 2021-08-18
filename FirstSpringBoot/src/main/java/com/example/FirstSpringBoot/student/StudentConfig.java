package com.example.FirstSpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student mariam =  new Student("Mariam", "mariam@gmail.com",
                   LocalDate.of(2000, Month.JANUARY, 5), 20);

            Student alex=  new Student("Alex", "Alex@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 8), 21);

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
