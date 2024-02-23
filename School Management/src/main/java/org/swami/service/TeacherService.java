package org.swami.service;

import org.springframework.stereotype.Service;
import org.swami.model.Teacher;
import org.swami.repo.TeacherRepo;

import java.util.Optional;

@Service
public class TeacherService {
    /*Teacher Service:

Register a new teacher.
Assign a teacher to a classroom.
View teacher details.*/

    private TeacherRepo teacherRepo;

    public TeacherService(TeacherRepo teacherRepo){
        this.teacherRepo=teacherRepo;
    }

    //Todo:Register a new teacher.
    public Teacher registerNewTeacher(Teacher newTeacher){
        return teacherRepo.save(newTeacher);
    }

    //Todo:Assign a teacher to a classroom.
    public Teacher assignTeacherToClass(){
        return null;
    }

    //Todo:View teacher details.
    public Teacher getTeacherDetails(Integer teacherId){
        Optional<Teacher> byId = teacherRepo.findById(teacherId);
        if(byId.isPresent()) {
            return byId.get();
        }
        return new Teacher();
    }
}
