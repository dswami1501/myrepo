package org.swami.model;

import jakarta.persistence.*;

@Entity
public class Issues {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int issueId;//pk
    private String type;
    private String details;
    private boolean isResolved;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student; // fk

    public Issues() {
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Issues{" +
                "issueId=" + issueId +
                ", type='" + type + '\'' +
                ", details='" + details + '\'' +
                ", isResolved=" + isResolved +
                ", student=" + student +
                '}';
    }
}
