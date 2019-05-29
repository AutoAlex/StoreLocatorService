package com.yourname.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.yourname.Entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {

    private static Map <Integer, Teacher> teachers;

    static  {

        teachers = new HashMap<Integer, Teacher>() {

            {
                put (1, new Teacher(1, "Dr. Kompi", "Front End Development"));
                put(2, new Teacher(2, "Dr. Jurrius", "Java Development"));
                put (3, new Teacher(3, "Dr. A. Makhalane", "Test Analyses"));
                put(4, new Teacher(4, "Dr. K. Gobinca", "Maritime Law"));
            }

        };
    }

    public Collection<Teacher> getAllTeachers(){

        return this.teachers.values();
    }

    public Teacher getTeacherByCourse(int id) {
        return this.teachers.get(id);
    }
}
