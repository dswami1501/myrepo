package com.querymaster.querymaster.dto;

import com.querymaster.querymaster.model.Student;

import java.util.List;

public class ClassDTO {
    private int classroomId;//pk
    private String section;
    private int grade;

    private List<Student> students;


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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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
