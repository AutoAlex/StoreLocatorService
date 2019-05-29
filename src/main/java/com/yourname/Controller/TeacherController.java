package com.yourname.Controller;

import com.yourname.Entity.Teacher;
import com.yourname.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Teacher> getAllTeachers(){

        return this.teacherService.getAllTeachers();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Teacher getTeacherByCourse(@PathVariable("id") int id) {
        return this.teacherService.getTeacherByCourse(id);
    }
}
