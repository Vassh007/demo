package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController // ability to expose the resources; endpoint client able to consume
@RequestMapping(path = "api/v1/students") //changes the url
public class StudentController {
// api endpoint

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(
                        1L,
                        "Katherine",
                        "Krios@FDMGroup.com",
                        Gender.FEMALE),
                new Student(
                        2L,
                        "Albert",
                        "A.Cruz@FDMGroup.com",
                        Gender.MALE),
                new Student(
                        3L, "" +
                        "Jacky",
                        "Jac.Singh@gmail.com",
                        Gender.OTHER)

        );
        return students;
    }
}
/*
build the api running and working fine and now going to build the front to take information from the backend to make it running from the backend
of the application.
 */