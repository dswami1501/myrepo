package com.querymaster.querymaster.dto;

import com.querymaster.querymaster.model.Classroom;

public class StudentDTO {
    private int studentId;//pk
    private String name;

    Classroom classroom;

    public StudentDTO() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                /*", classrooms='" + classrooms + '\'' +*/
                '}';
    }
}
