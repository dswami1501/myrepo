package com.onetoonerelationship.restapionetoonerelationship.service;

import com.onetoonerelationship.restapionetoonerelationship.dto.ClassDTO;
import com.onetoonerelationship.restapionetoonerelationship.model.Classroom;
import com.onetoonerelationship.restapionetoonerelationship.model.Student;
import com.onetoonerelationship.restapionetoonerelationship.repo.ClassroomRepo;
import com.onetoonerelationship.restapionetoonerelationship.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {

    private ClassroomRepo classroomRepo;
    @Autowired
    private StudentRepo studentRepo;

    public ClassroomService(ClassroomRepo classroomRepo){
        this.classroomRepo=classroomRepo;
    }

    public Classroom createClassroom(Classroom newClassroom){
        Student student = newClassroom.getStudent();
        if (student!=null){
            Optional<Student> studentById = studentRepo.findById(student.getStudentId());
            if (studentById.isPresent()){
                Student student1 = studentById.get();
                student1.setClassroom(newClassroom);
                newClassroom.setStudent(student1);
            }
        }
        return classroomRepo.save(newClassroom);
    }

    /*public Classroom getClassDetails(Integer classId) {
        Optional<Classroom> byId = classroomRepo.findById(classId);
        if (byId.isPresent()){
            return byId.get();
        }
        return new Classroom();
    }*/

    public ClassDTO getClassDetails(Integer classId) {
        return convertToClassroom(classId);
    }

    public ClassDTO convertToClassroom(Integer classId){
        Optional<Classroom> byId = classroomRepo.findById(classId);
        if(byId.isPresent()){
            Classroom classroom = byId.get();
            ClassDTO classDTO = new ClassDTO();
            classDTO.setClassroomId(classroom.getClassroomId());
            classDTO.setGrade(classroom.getGrade());
            classDTO.setSection(classroom.getSection());
            Optional<Student> studentByClassroomId = studentRepo.findStudentByClassroomId(classId);
            if (studentByClassroomId.isPresent()){
                classDTO.setStudent(studentByClassroomId.get());
            }
            return classDTO;
        }
        return new ClassDTO();
    }
}
