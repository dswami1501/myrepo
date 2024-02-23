package com.manytomanyrelationship.manytomanyrelationship.controller;

import com.manytomanyrelationship.manytomanyrelationship.dto.ClassDTO;
import com.manytomanyrelationship.manytomanyrelationship.model.Classroom;
import com.manytomanyrelationship.manytomanyrelationship.service.ClassroomService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classroom")
public class ClassController {
    private ClassroomService classroomService;

    public ClassController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping("/getclass/{classId}")
    public ClassDTO getClass(@PathVariable Integer classId){
        return classroomService.getClassDetails(classId);
    }

    @PostMapping("/createclass")
    public Classroom saveClass(@RequestBody Classroom newClass){
        return classroomService.createClassroom(newClass);
    }
}
