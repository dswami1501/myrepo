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

//Todo: Endpoints for JPQL(Java Persistence Query Language) start
    //Todo: Basic Crud Operation start
    @GetMapping("/getstudjpql/{studId}")
    public String getStudByJPQL(@PathVariable int studId){
        return studentService.getStudentByIdByJPQL(studId);
    }

    @GetMapping("/getstudnamejpql/{studName}")
    public String getStudByName(@PathVariable String studName){
        return studentService.getStudentByName(studName);
    }

    @PutMapping("/updatestudjpql/{studName}/{studId}")
    public String updateUsingJpql(@PathVariable String studName, @PathVariable int studId){
        return studentService.updateStudUsingJpql(studName, studId);
    }

    @PutMapping("/updatestudclassroomjpql/{grade}/{studId}")
    public String updateStudClassJpql(@PathVariable int grade, @PathVariable int studId){
        return studentService.updateStudClassUsingJpql(grade, studId);
    }

    @DeleteMapping("deletestud/{studId}")
    public String deleteStudWithJpql(@PathVariable int studId){
        return studentService.deleteStudjpql(studId);
    }
    //Todo: Basic Crud Operation start

    //Todo: Aggregation queries start
    @GetMapping("studcount/{classId}")
    public String getStudInClass(@PathVariable int classId){
        return studentService.totalStudInClass(classId);
    }

    @GetMapping("totalstudentid/{classId}")
    public String totalStudentidByClass(@PathVariable int classId){
        return studentService.totalStudentidOfClass(classId);
    }

    @GetMapping("maxMinStudentid/{classId}")
    public String maxMinStudentidByClass(@PathVariable int classId){
        return studentService.maxMinStudentidOfClass(classId);
    }

    @GetMapping("avgStudentid/{classId}")
    public String avgStudentidByClass(@PathVariable int classId){
        return studentService.averageStudentId(classId);
    }
    //Todo: Aggregation queries end
    //Todo: Join queries start
    @GetMapping("classgrade/{studId}")
    public String getClassGrade(@PathVariable int studId){
        return studentService.allClassGradeAndGradeByStudentId(studId);
    }
    //Todo: Join queries end

    //Todo: Subqueries start
    @GetMapping("subquery/{classGrade}")
    public String usingClassGrade(@PathVariable int classGrade){
        return studentService.usingSubQuery(classGrade);
    }
    //Todo: Subqueries end

    //Todo: Pagination start
    @GetMapping("/pagination/{pNo}/{pSize}")
    public String usePagination(@PathVariable int pNo, @PathVariable int pSize){
        return studentService.usingPagination(pNo,pSize);
    }
    //Todo: Pagination end
//Todo: Endpoints for JPQL(Java Persistence Query Language) end

    @GetMapping("/test")
    public String getTest(){
        return "success";
    }
}
