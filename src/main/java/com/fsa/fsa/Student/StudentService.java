package com.fsa.fsa.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
