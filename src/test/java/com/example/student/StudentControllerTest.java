package com.example.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void addedStudentAppearsInList() {
        StudentController controller = new StudentController();
        Student s = new Student();
        s.setName("Arnav");
        s.setCourse("CSE");

        controller.addStudent(s);

        assertEquals(1, controller.getAllStudents().size());
        assertEquals("Arnav", controller.getAllStudents().get(0).getName());
        assertEquals(1, s.getId());
    }
}
