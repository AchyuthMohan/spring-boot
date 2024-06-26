package com.example.demo;
import com.example.demo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student("Achyuth",22,LocalDate.of(2002,
						Month.MAY,14),
						"achyuthmohan1@gmail.com",
						1),
				new Student("Nandini",22,LocalDate.of(2001,
						Month.OCTOBER,05),
						"pnandini@gmail.com",
						2)
		);
	}
}
