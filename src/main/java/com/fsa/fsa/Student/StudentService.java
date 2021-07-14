package com.fsa.fsa.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Adrian",
                "adrian.achim@email.com",
                LocalDate.of(1999, Month.OCTOBER, 6),
                21
        ));
    }
}
