package com.onetomanyrelationship.restapionetomanyrelationship.service;

import com.onetomanyrelationship.restapionetomanyrelationship.dto.ClassDTO;
import com.onetomanyrelationship.restapionetomanyrelationship.model.Classroom;
import com.onetomanyrelationship.restapionetomanyrelationship.model.Student;
import com.onetomanyrelationship.restapionetomanyrelationship.repo.ClassroomRepo;
import com.onetomanyrelationship.restapionetomanyrelationship.repo.StudentRepo;
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
        List<Student> students = newClassroom.getStudents();
        List<Student> persistingStuds = new ArrayList<>();
        if (students!=null||!students.isEmpty()){
            Iterator<Student> stuItr = students.iterator();
            while (stuItr.hasNext()){
                Student student = stuItr.next();
                Optional<Student> studentById = studentRepo.findById(student.getStudentId());
                if (studentById.isPresent()){
                    studentById.get().setClassroom(newClassroom);
                    persistingStuds.add(studentById.get());
                }
            }
        }
        if (persistingStuds!=null||!persistingStuds.isEmpty()){
            newClassroom.setStudents(persistingStuds);
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
            Optional<List<Student>> studentsByClassroomId = studentRepo.findStudentsByClassroomId(classId);
            if (studentsByClassroomId.isPresent()){
                classDTO.setStudents(studentsByClassroomId.get());
            }
            return classDTO;
        }
        return new ClassDTO();
    }
}
