package com.gs.reactive;

import com.gs.reactive.student.Student;
import com.gs.reactive.student.StudentRepository;
import com.gs.reactive.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentService studentService) {

		return args -> {
			for (int i = 0; i < 10; i++) {
				studentService.save(Student.builder()
						.name("Gulsum" + i)
						.lastName("Satic" + i)
						.age(String.valueOf(i))
						.build()
				).subscribe();

			}
		};
	}

}
