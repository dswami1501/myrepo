package com.manytomanyrelationship.manytomanyrelationship.dto;

import com.manytomanyrelationship.manytomanyrelationship.model.Classroom;
import org.springframework.stereotype.Component;

import java.util.List;

public class StudentDTO {
    private int studentId;//pk
    private String name;

    private List<Classroom> classrooms;

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

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                /*", classrooms='" + classrooms + '\'' +*/
                '}';
    }
}
