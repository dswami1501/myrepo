package com.onetomanyrelationship.restapionetomanyrelationship.repo;

import com.onetomanyrelationship.restapionetomanyrelationship.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    @Query("SELECT s FROM Student s JOIN s.classroom c WHERE c.classroomId = :classroomId")
    Optional<List<Student>> findStudentsByClassroomId(@Param("classroomId") int classroomId);
}
