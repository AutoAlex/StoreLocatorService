package com.yourname.Dao;

import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {

            {
                put(1, new Student(1, "Shaun", "Front End Development"));
                put(2, new Student(2, "Akhona", "Front End Development"));
                put(3, new Student(3, "Alex", "Technical Test Analyses"));
                put(4, new Student(4,"Kamva", "Law"));
            }

        };
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student removeStudentById(int id) {
        return this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setName(student.getName());
        s.setCourse(student.getCourse());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudent(Student student) {
        this.students.put(student.getId(), student);
    }

}