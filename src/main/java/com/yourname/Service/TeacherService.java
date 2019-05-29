package com.yourname.Service;

import com.yourname.Entity.Teacher;
import com.yourname.Dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public Collection<Teacher> getAllTeachers(){

        return this.teacherDao.getAllTeachers();
    }

    public Teacher getTeacherByCourse(int id) {
        return this.teacherDao.getTeacherByCourse(id);
    }
}
