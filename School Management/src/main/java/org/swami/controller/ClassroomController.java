package org.swami.controller;

import org.springframework.web.bind.annotation.*;
import org.swami.dto.ClassDto;
import org.swami.model.Classroom;
import org.swami.service.ClassroomService;

@RestController
@RequestMapping("/school/classroom")
public class ClassroomController {
    private ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService){
        this.classroomService=classroomService;
    }

    @GetMapping("/getclass/{classId}")
    public ClassDto getClass(@PathVariable Integer classId){
        return classroomService.getClassDetails(classId);
    }
    @PostMapping("/saveclass")
    public Classroom saveClass(@RequestBody Classroom classroom){
        return classroomService.createClassroom(classroom);
    }
}
