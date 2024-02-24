package com.querymaster.querymaster.repo;

import com.querymaster.querymaster.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
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
}
