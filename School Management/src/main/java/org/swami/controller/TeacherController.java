package org.swami.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.model.Teacher;
import org.swami.service.TeacherService;

@RestController
@RequestMapping("/school/teacher")
public class TeacherController {
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService){
        this.teacherService=teacherService;
    }

    @PostMapping("/savet")
    public Teacher saveTeacher(@RequestBody Teacher newTeacher){
        return teacherService.registerNewTeacher(newTeacher);
    }
}
