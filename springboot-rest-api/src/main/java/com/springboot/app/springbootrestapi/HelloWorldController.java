package com.springboot.app.springbootrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@controller
//@responsebody
@RestController
public class HelloWorldController {
    //GET HTTP Method
    //http://localhost:8080/hello-world
    @GetMapping("/hello-world") //to make it a rest api
    public String helloWorld(){
        return "Hello World!";
    }

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Akshay", "Choudhary") );
        students.add(new Student("Tom", "Cruise") );
        students.add(new Student("Andy", "fuller") );
        students.add(new Student("John", "Smith") );
        return students;
    }
}
