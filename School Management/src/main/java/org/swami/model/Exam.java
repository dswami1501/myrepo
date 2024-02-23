package org.swami.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int examId;//pk
    private Date date;
    private String name;
    private int type;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
    private List<Result> results;

    public Exam() {
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", results=" + results +
                '}';
    }
}
