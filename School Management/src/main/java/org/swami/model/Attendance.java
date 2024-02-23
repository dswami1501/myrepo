package org.swami.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;//pk
    private Date date;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student; // fk

    @ManyToOne
    @JoinColumn(name = "teacherId")
    private Teacher teacher; // fk

    public Attendance() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "userId=" + userId +
                ", date=" + date +
                ", status=" + status +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
