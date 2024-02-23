package org.swami.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int ttId;//pk
    private String day;
    private String time;
    private String subject;
    private int classroomId;//fk
    @OneToMany(mappedBy = "timetable", cascade = CascadeType.ALL)
    private List<Classroom> classrooms;

    public Timetable() {
    }

    public int getTtId() {
        return ttId;
    }

    public void setTtId(int ttId) {
        this.ttId = ttId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "ttId=" + ttId +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                ", subject='" + subject + '\'' +
                ", classroomId=" + classroomId +
                ", classrooms=" + classrooms +
                '}';
    }
}
