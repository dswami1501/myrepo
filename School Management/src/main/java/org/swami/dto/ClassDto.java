package org.swami.dto;

import org.swami.model.Student;
import org.swami.model.Subject;
import org.swami.model.Teacher;
import org.swami.model.Timetable;

import java.util.List;

public class ClassDto {
    private int classroomId;//pk
    private String section;
    private int grade;
    private List<Subject> subjects;
    private List<Student> students;
    private Teacher teacher; // fk
    private Timetable timetable; // fk

    public ClassDto() {
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", section='" + section + '\'' +
                ", grade=" + grade +
                ", subjects=" + subjects +
                ", teacher=" + teacher +
                ", timetable=" + timetable +
                '}';
    }
}
