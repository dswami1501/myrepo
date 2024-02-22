package com.manytomanyrelationship.manytomanyrelationship.model;

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
    @ManyToMany
    @JoinTable(
            name = "classroom_student",
            joinColumns = @JoinColumn(name = "classroomId"),
            inverseJoinColumns = @JoinColumn(name = "studentId")
    )
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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
