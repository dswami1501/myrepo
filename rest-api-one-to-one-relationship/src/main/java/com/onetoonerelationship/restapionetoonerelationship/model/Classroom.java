package com.onetoonerelationship.restapionetoonerelationship.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
/*@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@classroomId")*///working
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int classroomId;//pk
    private String section;
    private int grade;

    @JsonIgnore
    /*@OneToOne(mappedBy = "classroom", cascade = CascadeType.ALL)*/
    @OneToOne
    @JoinColumn(name = "studentId")
    private Student student;

    public Classroom() {
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

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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
