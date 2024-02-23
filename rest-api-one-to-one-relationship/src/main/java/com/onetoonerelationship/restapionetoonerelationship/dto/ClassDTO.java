package com.onetoonerelationship.restapionetoonerelationship.dto;



import com.onetoonerelationship.restapionetoonerelationship.model.Student;

import java.util.List;

public class ClassDTO {
    private int classroomId;//pk
    private String section;
    private int grade;

    private Student student;


    public ClassDTO() {
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", section='" + section + '\'' +
                ", grade=" + grade +
                /*", students=" + students +*/
                '}';
    }
}
