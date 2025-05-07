package com.gs.reactive.student;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;



    @PostMapping
    public Mono<Student> save(@RequestBody Student student) {
        return studentService.save(student);
    }


    @GetMapping
    public Flux<Student> findAll() {
        return studentService.findAll();
    }


    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable Integer id) {
        return studentService.findById(id);
    }


}
