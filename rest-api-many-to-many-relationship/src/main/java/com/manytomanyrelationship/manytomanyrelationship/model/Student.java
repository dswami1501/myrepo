package com.manytomanyrelationship.manytomanyrelationship.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
/*@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@studentId")*///working
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int studentId;//pk
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "students")
    private List<Classroom> classrooms;

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

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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
