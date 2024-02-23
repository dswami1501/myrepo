package org.swami.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.model.Subject;
import org.swami.service.SubjectService;

@RestController
@RequestMapping("/school/subject")
public class SubjectController {

    private SubjectService subjectService;

    public SubjectController(SubjectService subjectService){
        this.subjectService=subjectService;
    }

    @PostMapping("/savesub")
    public Subject saveSubject(@RequestBody Subject newSubject){
        return subjectService.createNewSubject(newSubject);
    }
}
