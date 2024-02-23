package com.querymaster.querymaster.controller;

import com.querymaster.querymaster.dto.StudentDTO;
import com.querymaster.querymaster.model.Student;
import com.querymaster.querymaster.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stud")
public class StudentController {
    Logger logger = LoggerFactory.getLogger(StudentController.class);
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/getstud/{studId}")
    public StudentDTO getStud(@PathVariable Integer studId){
        StudentDTO studentById = studentService.getStudentById(studId);
        logger.info("Student object is {}",studentById.getClassroom());
        return studentById;
    }

    @PostMapping("/savestud")
    public Student saveStud(@RequestBody Student newStud){
        return studentService.registerNewStudent(newStud);
    }
    @GetMapping("/test")
    public String getTest(){
        return "success";
    }
}
