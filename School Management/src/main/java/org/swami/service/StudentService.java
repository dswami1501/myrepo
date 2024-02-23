package org.swami.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.swami.dto.StudentDto;
import org.swami.model.*;
import org.swami.repo.ClassroomRepo;
import org.swami.repo.StudentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    /*Student Service:

    Register a new student.
    Get student details by ID.
    Update student information.
    Enroll/withdraw from a classroom.
    View student attendance.*/

    private StudentRepo studentRepo;
    @Autowired
    private ResultService resultService;

    @Autowired
    private ClassroomRepo classroomRepo;

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private IssuesService issuesService;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    //Todo:Register a new student.
    public Student registerNewStudent(Student newStudent){
        /*if(newStudent.getResults()!=null){
            setStudentResult(newStudent);
        }
        if(newStudent.getClassrooms()!=null){
            setStudentClass(newStudent);
        }
        if(newStudent.getAttendances()!=null){
            setStudentAttendance(newStudent);
        }
        if(newStudent.getIssues()!=null){
            setStudentIssue(newStudent);
        }*/
        return studentRepo.save(newStudent);
    }

    //Todo:Set student result
    /*public Result setStudentResult(Student studentResult){
        return resultService.setStudentResultInResultTable(studentResult);
    }*/

    //Todo:Set student classroom
    /*public Classroom setStudentClass(Student studentClass){
        return classroomService.setStudentClassInClassroomTable(studentClass);
    }*/

    //Todo:Set student attendance
    /*public Attendance setStudentAttendance(Student studentAttendance){
        return attendanceService.setStudentAttendanceInAttendanceTable(studentAttendance);
    }*/

    //Todo:Set student issue
    /*public Issues setStudentIssue(Student studentIssue){
        return issuesService.setStudentIssueInIssuesTable(studentIssue);
    }*/

    //Todo:Get student details by ID.
    public StudentDto getStudentById(Integer studentId){
        return getStudentDtoUsingStudent(studentId);
    }

    public StudentDto getStudentDtoUsingStudent(Integer studentId){
        Optional<Student> studentById = studentRepo.findById(studentId);
        if (studentById.isPresent()){
            Student student = studentById.get();
            StudentDto sDto = new StudentDto();
            sDto.setStudentId(student.getStudentId());
            sDto.setAttendances(student.getAttendances());
            sDto.setAddress(student.getAddress());
            Optional<List<Classroom>> classroomByStudentId = classroomRepo.findClassroomByStudentId(studentId);
            if (classroomByStudentId.isPresent()){
                sDto.setClassrooms(classroomByStudentId.get());
            }
            sDto.setDob(student.getDob());
            sDto.setIssues(student.getIssues());
            sDto.setEmail(student.getEmail());
            sDto.setName(student.getName());
            sDto.setDateOfJoining(student.getDateOfJoining());
            sDto.setParentName(student.getParentName());
            sDto.setPassword(student.getPassword());
            sDto.setPhone(student.getPhone());
            sDto.setResults(student.getResults());
            sDto.setSex(student.getSex());
            return sDto;
        }
        return new StudentDto();
    }

    //Todo: Update student information.
    /*public Student updateRegisteredStudent(Student existingStudent){
        Integer studentId = existingStudent.getStudentId();
        Student studentById = getStudentById(studentId);
        if (!existingStudent.getEmail().equals(studentById.getEmail())){
            studentById.setEmail(existingStudent.getEmail());
        }
        if (!existingStudent.getPassword().equals(studentById.getPassword())){
            studentById.setPassword(existingStudent.getPassword());
        }
        if (!existingStudent.getName().equals(studentById.getName())){
            studentById.setName(existingStudent.getName());
        }
        if (!existingStudent.getDob().equals(studentById.getDob())){
            studentById.setDob(existingStudent.getDob());
        }
        if (!existingStudent.getSex().equals(studentById.getSex())){
            studentById.setSex(existingStudent.getSex());
        }
        if (!existingStudent.getAddress().equals(studentById.getAddress())){
            studentById.setAddress(existingStudent.getAddress());
        }
        if (!existingStudent.getPhone().equals(studentById.getPhone())){
            studentById.setPhone(existingStudent.getPhone());
        }
        if (!existingStudent.getDateOfJoining().equals(studentById.getDateOfJoining())){
            studentById.setDateOfJoining(existingStudent.getDateOfJoining());
        }
        if (!existingStudent.getParentName().equals(studentById.getParentName())){
            studentById.setParentName(existingStudent.getParentName());
        }
        *//*if(!existingStudent.getResults().equals(studentById.getResults())){
            setStudentResult(existingStudent);
        }
        if(!existingStudent.getClassrooms().equals(studentById.getClassrooms())){
            setStudentClass(existingStudent);
        }
        if(!existingStudent.getAttendances().equals(studentById.getAttendances())){
            setStudentAttendance(existingStudent);
        }
        if(!existingStudent.getIssues().equals(studentById.getIssues())){
            setStudentIssue(existingStudent);
        }*//*
        return studentRepo.save(studentById);
    }*/

    //Todo: View student attendance
    public Attendance getStudentAttendance(){
        return null;
    }
}
