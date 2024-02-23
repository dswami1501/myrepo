package org.swami.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.model.Exam;
import org.swami.service.ExamService;

@RestController
@RequestMapping("/school/exam")
public class ExamController {
    private ExamService examService;

    public ExamController(ExamService examService){
        this.examService=examService;
    }

    @PostMapping("/savee")
    public Exam saveExam(@RequestBody Exam newExam){
        return examService.createNewExam(newExam);
    }
}
