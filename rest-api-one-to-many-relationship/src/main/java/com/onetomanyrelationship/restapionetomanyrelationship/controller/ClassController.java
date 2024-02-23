package com.onetomanyrelationship.restapionetomanyrelationship.controller;

import com.onetomanyrelationship.restapionetomanyrelationship.dto.ClassDTO;
import com.onetomanyrelationship.restapionetomanyrelationship.model.Classroom;
import com.onetomanyrelationship.restapionetomanyrelationship.service.ClassroomService;
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
