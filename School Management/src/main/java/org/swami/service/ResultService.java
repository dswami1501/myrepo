package org.swami.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.swami.model.Exam;
import org.swami.model.Result;
import org.swami.model.Student;
import org.swami.repo.ResultRepo;

import java.util.List;

@Service
public class ResultService {
    /*Result Service:

Calculate and record results for exams.
View results for a student or classroom.
Generate result reports.*/

    private ResultRepo resultRepo;
    
    @Autowired
    private ExamService examService;

    public ResultService(ResultRepo resultRepo){
        this.resultRepo=resultRepo;
    }

    //Todo:Calculate and record results for exams.
    public Result saveResult(Result result){
        return resultRepo.save(result);
    }
    
    /*public Exam saveExam(Result examResult){
        Exam exam = examResult.getExam();
        if(exam!=null){
            examService.createNewExam(exam);
        }
        return exam;
    }*/
    /*public Result setStudentResultInResultTable(Student student){
        List<Result> results = student.getResults();
        Result result=null;
        for(Result singleResult:results){
            saveExam(singleResult);
            result = saveResult(singleResult);
        }
        return result;
    }*/

    //Todo: View results for a student or classroom.
    public Result getResultForStudent(){
        return null;
    }

    //Todo: Generate result reports.
}
