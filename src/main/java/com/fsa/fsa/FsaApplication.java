package com.fsa.fsa;
import com.fsa.fsa.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class FsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsaApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(
				1L,
				"Adrian",
				"adrian.achim@email.com",
				LocalDate.of(1999, Month.OCTOBER,6),
				21
		));
	}
}
