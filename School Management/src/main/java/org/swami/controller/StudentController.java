package org.swami.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;
import org.swami.dto.StudentDto;
import org.swami.model.Student;
import org.swami.service.StudentService;

@RestController
@RequestMapping("/school/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/getstud/{id}")
    public StudentDto getStudent(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/stud")
    public Student saveStudent(@RequestBody Student student){
        return studentService.registerNewStudent(student);
    }

    @GetMapping("/gets")
    public String getString(){
        return "success";
    }
}
