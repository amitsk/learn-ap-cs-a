package com.github.amitsk.learnapcsa;

import com.github.amitsk.learnapcsa.unit3.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void testStudent() {
        Student student = new Student();
        Student oStudent = new Student("Amit");
        Assertions.assertEquals( student.getName(), "");
        Assertions.assertEquals( oStudent.getName(), "Amit");

    }
}
