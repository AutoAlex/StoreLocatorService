package com.yourname.Dao;

import com.yourname.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Student getStudentById(int id);

    Collection<Student> getAllStudents();

    Student removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
