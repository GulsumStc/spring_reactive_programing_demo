package com.gs.reactive.student;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "students")
public class Student {


    @Id
    private Integer id;
    private String name;
    private String lastName;
    private String age;


}
