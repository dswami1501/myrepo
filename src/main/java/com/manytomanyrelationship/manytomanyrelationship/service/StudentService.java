package com.manytomanyrelationship.manytomanyrelationship.service;

import com.manytomanyrelationship.manytomanyrelationship.dto.StudentDTO;
import com.manytomanyrelationship.manytomanyrelationship.model.Classroom;
import com.manytomanyrelationship.manytomanyrelationship.model.Student;
import com.manytomanyrelationship.manytomanyrelationship.repo.ClassroomRepo;
import com.manytomanyrelationship.manytomanyrelationship.repo.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    Logger logger = LoggerFactory.getLogger(StudentService.class);


    private StudentRepo studentRepo;
    @Autowired
    private ClassroomRepo classroomRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    //Todo:Register a new student.
    public Student registerNewStudent(Student newStudent){
        return studentRepo.save(newStudent);
    }

    //Todo:Get student details by ID.
    public StudentDTO getStudentById(Integer studentId){
        return convertStudentToStudentDto(studentId);
    }

    public StudentDTO convertStudentToStudentDto(Integer studentId){
        Optional<Student>  newStudent = studentRepo.findById(studentId);
        if(newStudent.isPresent()){
            Student student = newStudent.get();
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setStudentId(student.getStudentId());
            studentDTO.setName(student.getName());
            Optional<List<Classroom>> classroomsByStudentId = classroomRepo.findClassroomByStudentId(studentId);
            if(classroomsByStudentId.isPresent()){
                List<Classroom>  classrooms = classroomsByStudentId.get();
                studentDTO.setClassrooms(classrooms);
                Iterator<Classroom> itr = classrooms.iterator();//this iterator is used for printing every class only
                while (itr.hasNext()){
                    Classroom next = itr.next();
                    logger.info("ClassIds are {}",next.getClassroomId());
                }
            }
            return studentDTO;
        }
        return new StudentDTO();
    }
}
