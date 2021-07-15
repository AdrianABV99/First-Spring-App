package com.fsa.fsa.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args-> {
          Student adi = new Student(

                    "Adrian",
                    "adrian.achim@email.com",
                    LocalDate.of(1999, Month.OCTOBER, 6)

                );
          Student ale = new Student(

                  "ale",
                  "ale.alexandra@email.com",
                  LocalDate.of(2000, Month.MAY, 29)
          );

          repository.saveAll(List.of(adi,ale));
            };
        }

}
