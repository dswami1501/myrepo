package com.querymaster.querymaster.service;

import com.querymaster.querymaster.dto.StudentDTO;
import com.querymaster.querymaster.model.Classroom;
import com.querymaster.querymaster.model.Student;
import com.querymaster.querymaster.repo.ClassroomRepo;
import com.querymaster.querymaster.repo.StudentRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
            Optional<Classroom> classroomByStudentId = classroomRepo.findClassroomByStudentId(studentId);
            if(classroomByStudentId.isPresent()){
                studentDTO.setClassroom(classroomByStudentId.get());
            }
            return studentDTO;
        }
        return new StudentDTO();
    }

    //Todo: Service methods using Jpql: start
    public String insertUsingJpql(Student newStud){
        int i = studentRepo.insertUsingJpql(newStud.getName(), newStud.getClassroom().getClassroomId());
        return "new Student is: "+i;
    }

    public String getStudentByIdByJPQL(int studId){
        Optional<Student> studentById = studentRepo.findStudentById(studId);
        if (studentById.isPresent()){
            return "getStudentById "+ studentById.get();
        }
        return "getStudentById "+ studentById.get();
    }

    //Todo: Service methods using Jpql: end
}
