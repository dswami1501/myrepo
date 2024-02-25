package com.querymaster.querymaster.service;

import com.querymaster.querymaster.dto.StudentDTO;
import com.querymaster.querymaster.model.Classroom;
import com.querymaster.querymaster.model.Student;
import com.querymaster.querymaster.repo.ClassroomRepo;
import com.querymaster.querymaster.repo.StudentRepo;
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
    //Todo: Basic Crud Operations start
    public String getStudentByIdByJPQL(int studId){
        Optional<Student> studentById = studentRepo.findStudentById(studId);
        if (studentById.isPresent()){
            return "getStudentById "+ studentById.get();
        }
        return "getStudentById "+ studentById.get();
    }

    public String getStudentByName(String studName){
        Optional<Student> studentByName = studentRepo.findStudentByName(studName);
        if (studentByName.isPresent()){
            return "getStudentById "+ studentByName.get();
        }
        return "getStudentById "+ studentByName.get();
    }

    @Transactional
    public String updateStudUsingJpql(String name,int studId ){
        int i = studentRepo.updateStudentName(name, studId);
        return "updateStudUsingJpql "+i;
    }

    @Transactional
    public String updateStudClassUsingJpql(int grade,int studId ){
        int i = studentRepo.updateClassroomGradeByStudentId(grade, studId);
        return "updateStudClassUsingJpql "+i;
    }

    @Transactional
    public String deleteStudjpql(int studId ){
        int i = studentRepo.deleteStudentById(studId);
        return "deleteStudjpql "+i;
    }
    //Todo: Basic Crud Operations end

    //Todo: Aggregation queries start
    public String totalStudInClass(int classId){
        return "totalStudInClass "+ studentRepo.countStudentsByClassroom(classId);
    }

    public String totalStudentidOfClass(int classId){
        Classroom classroomById = studentRepo.findClassroomById(classId);
        return "totalStudentidOfClass "+studentRepo.calculateTotalStudentidByClassroom(classroomById);
    }

    public String maxMinStudentidOfClass(int classId){
        Classroom classroomById = studentRepo.findClassroomById(classId);
        return "maxStudentidOfClass "+studentRepo.findHighestStudentidByClassroom(classroomById) + " minStudentidOfClass "+studentRepo.findLowestStudentidByClassroom(classroomById);
    }

    public String averageStudentId(int classId){
        Classroom classroomById = studentRepo.findClassroomById(classId);
        return "averageStudentId "+studentRepo.averageStudentidByClassroom(classroomById);
    }
    //Todo: Aggregation queries end
//Todo: Service methods using Jpql: end
}
