package com.example.demo.student;

import lombok.*;
import org.springframework.stereotype.Service;

@ToString
@Getter
@Service
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private String email;
    private Gender gender;
}
