package org.swami.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.swami.dto.ClassDto;
import org.swami.model.Classroom;
import org.swami.model.Result;
import org.swami.model.Student;
import org.swami.model.Timetable;
import org.swami.repo.ClassroomRepo;
import org.swami.repo.StudentRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {
    /*Classroom Service:

    Create a new classroom.
    Assign a teacher to a classroom.
    Enroll/withdraw students from a classroom.
    View the list of students in a classroom.
    View the timetable for a classroom.*/

    @Autowired
    private StudentRepo studentRepo;
    private ClassroomRepo classroomRepo;

    public ClassroomService(ClassroomRepo classroomRepo){
        this.classroomRepo=classroomRepo;
    }

    //Todo: Create a new classroom.
    public Classroom createClassroom(Classroom newClassroom){
        return classroomRepo.save(newClassroom);
    }

    //Todo: Assign a teacher to a classroom.
    public String assignTeacherToClass(){
        return null;
    }

    //Todo: Enroll/withdraw students from a classroom.
    public String enrollWithdrawStudentFromClass(Student student, Integer classId){
        Classroom classroomById=null;
        boolean isStudentAlreadyAssignedToClass=false;
            Optional<Classroom> studentClass = classroomRepo.findById(classId);
            if(studentClass.isPresent()){
                classroomById = studentClass.get();
            }
        if(classroomById!=null){
            List<Student> students = classroomById.getStudents();
            for(Student singleStudent:students){
                if(student.equals(singleStudent)){
                    isStudentAlreadyAssignedToClass= true;
                    break;
                }
            }
        }
        if(isStudentAlreadyAssignedToClass){
            return "Student is already enrolled in this class";
        }
        else{
            ArrayList<Student> studentInList = new ArrayList<>();
            studentInList.add(student);
            classroomById.setStudents(studentInList);
            Classroom enrolledStudent = classroomRepo.save(classroomById);
            return "Student enrolled Successfully "+enrolledStudent;
        }
    }

    //Todo: View the list of students in a classroom.
    public List<Student> getStudentsListForClass(){
        return null;
    }

    //Todo: View the timetable for a classroom.
    public Timetable getTimetableForClass(){
        return null;
    }

    public Classroom setStudentClassInClassroomTable(Student student) {
        List<Classroom> classrooms = student.getClassrooms();
        Classroom classroom =null;
        for(Classroom singleClass:classrooms){
            classroom = classroomRepo.save(singleClass);
        }
        return classroom;
    }

    //Todo: Get class by id
    public ClassDto getClassDetails(Integer classId) {
        Optional<Classroom> byId = classroomRepo.findById(classId);
        if(byId.isPresent()){
            Classroom classroom = byId.get();
            ClassDto classDto = new ClassDto();
            classDto.setClassroomId(classroom.getClassroomId());
            classDto.setGrade(classroom.getGrade());
            classDto.setSection(classroom.getSection());
            Optional<List<Student>> studentsByClassroomId = studentRepo.findStudentsByClassroomId(classId);
            if (studentsByClassroomId.isPresent()){
                classDto.setStudents(studentsByClassroomId.get());
            }
            classDto.setSubjects(classroom.getSubjects());
            classDto.setTeacher(classroom.getTeacher());
            classDto.setTimetable(classroom.getTimetable());
            return classDto;
        }
        return new ClassDto();
    }
}
