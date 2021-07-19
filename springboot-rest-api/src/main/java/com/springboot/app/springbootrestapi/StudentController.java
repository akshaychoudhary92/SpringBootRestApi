package com.springboot.app.springbootrestapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Akshay", " Choudhary");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Akshay", "Choudhary") );
        students.add(new Student("Tom", "Cruise") );
        students.add(new Student("Andy", "fuller") );
        students.add(new Student("John", "Smith") );
        return students;
    }
    //pathvariable get method
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }

    //build rest api to handle query parameters
    // http://localhost:8080/student?firstName=Akshay&lastName=Choudhary

    @GetMapping("/student/query")
    public Student studentQueryparam(@RequestParam(name = "firstName") String firstName, @RequestParam(name = "lastName") String lastName){
        return new Student(firstName, lastName);
    }
}
