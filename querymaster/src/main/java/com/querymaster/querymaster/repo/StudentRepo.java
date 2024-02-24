package com.querymaster.querymaster.repo;

import com.querymaster.querymaster.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s WHERE s.studentId = :studentId")
    Optional<Student> findStudentById(@Param("studentId") int studentId);

    @Query("SELECT s FROM Student s JOIN s.classroom c WHERE c.classroomId = :classroomId")
    Optional<List<Student>> findStudentsByClassroomId(@Param("classroomId") int classroomId);

    @Modifying
    @Query("UPDATE Student s SET s.name = :name WHERE s.studentId = :studentId")
    int updateStudentName(@Param("name") String name, @Param("studentId") int studentId);

    @Modifying
    @Query("UPDATE Classroom c SET c.grade = :grade WHERE c = (SELECT s.classroom FROM Student s WHERE s.studentId = :studentId)")
    int updateClassroomGradeByStudentId(@Param("grade") int grade, @Param("studentId") int studentId);

    @Modifying
    @Query("DELETE FROM Student s WHERE s.id = :studentId")
    int deleteStudentById(@Param("studentId") int studentId);
}
