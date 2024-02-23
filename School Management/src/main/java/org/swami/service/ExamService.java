package org.swami.service;

import org.springframework.stereotype.Service;
import org.swami.model.Exam;
import org.swami.model.Result;
import org.swami.repo.ExamRepo;

@Service
public class ExamService {
    /*Exam Service:

Schedule a new exam.
Record exam results for students.
View exam results by student or classroom.*/

    private ExamRepo examRepo;

    public ExamService(ExamRepo examRepo){
        this.examRepo=examRepo;
    }

    //Todo: Schedule a new exam.
    public Exam createNewExam(Exam newExam){
        return examRepo.save(newExam);
    }

    //Todo: Record exam results for students.
    public String saveMarks(){
        return null;
    }


    //Todo: View exam results by student or classroom.
    public Result getExamResultForStudent(){
        return null;
    }
}
