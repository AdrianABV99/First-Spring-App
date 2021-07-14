package com.fsa.fsa;
import com.fsa.fsa.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class FsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsaApplication.class, args);
	}

}
