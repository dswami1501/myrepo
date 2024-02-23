package org.swami.model;

import jakarta.persistence.*;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int resultId;//pk
    @ManyToOne
    @JoinColumn(name = "examId")
    private Exam exam; // fk
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student; // fk
    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subject; // fk
    private int marks;

    public Result() {
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId=" + resultId +
                ", exam=" + exam +
                ", student=" + student +
                ", subject=" + subject +
                ", marks=" + marks +
                '}';
    }
}
