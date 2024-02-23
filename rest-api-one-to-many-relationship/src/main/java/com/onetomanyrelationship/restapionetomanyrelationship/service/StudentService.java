package com.onetomanyrelationship.restapionetomanyrelationship.service;

import com.onetomanyrelationship.restapionetomanyrelationship.dto.StudentDTO;
import com.onetomanyrelationship.restapionetomanyrelationship.model.Classroom;
import com.onetomanyrelationship.restapionetomanyrelationship.model.Student;
import com.onetomanyrelationship.restapionetomanyrelationship.repo.ClassroomRepo;
import com.onetomanyrelationship.restapionetomanyrelationship.repo.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    /*public Student getStudentById(Integer studentId){
        Optional<Student> byId = studentRepo.findById(studentId);
        if (byId.isPresent()){
            return byId.get();
        }
        return new Student();
    }*/
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
            Optional<Classroom> classroomByStudentId = classroomRepo.findClassroomByStudentId(studentId);
            if(classroomByStudentId.isPresent()){
                studentDTO.setClassroom(classroomByStudentId.get());
            }
            return studentDTO;
        }
        return new StudentDTO();
    }
}
