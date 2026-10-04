package com.example.student;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final List<Student> students = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger();

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        student.setId(counter.incrementAndGet());
        students.add(student);
        return student;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }
}
