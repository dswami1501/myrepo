package com.manytomanyrelationship.manytomanyrelationship.service;

import com.manytomanyrelationship.manytomanyrelationship.dto.ClassDTO;
import com.manytomanyrelationship.manytomanyrelationship.model.Classroom;
import com.manytomanyrelationship.manytomanyrelationship.model.Student;
import com.manytomanyrelationship.manytomanyrelationship.repo.ClassroomRepo;
import com.manytomanyrelationship.manytomanyrelationship.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        return classroomRepo.save(newClassroom);
    }

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
            Optional<List<Student>> studentsByClassroomId = studentRepo.findStudentsByClassroomId(classId);
            if (studentsByClassroomId.isPresent()){
                classDTO.setStudents(studentsByClassroomId.get());
            }
            return classDTO;
        }
        return new ClassDTO();
    }
}
