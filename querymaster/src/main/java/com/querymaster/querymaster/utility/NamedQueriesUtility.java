package com.querymaster.querymaster.utility;

public class NamedQueriesUtility {
    public static final String FIND_STUDENTS_BY_CLASSROOM_ID = "SELECT s FROM Student s WHERE s.classroom.classroomId = :classroomId";
    public static final String FIND_CLASSROOMS_BY_GRADE = "SELECT c FROM Classroom c WHERE c.grade = :grade";


}
