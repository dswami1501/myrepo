package com.querymaster.querymaster.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int studentId;//pk
    private String name;

    @JsonIgnore
    @ManyToOne
    /*@ManyToOne(cascade = CascadeType.ALL)*/
    @JoinColumn(name = "classroomId")
    private Classroom classroom;

    public Student() {
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

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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
