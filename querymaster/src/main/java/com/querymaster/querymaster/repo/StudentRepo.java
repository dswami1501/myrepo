package com.querymaster.querymaster.repo;

import com.querymaster.querymaster.model.Classroom;
import com.querymaster.querymaster.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Transactional
    @Query("INSERT INTO Student(name, classroom) SELECT :name, c FROM Classroom c WHERE c.classroomId = :classroomId")
    @Modifying
    int insertUsingJpql(@Param("name") String name, @Param("classroomId") int classroomId);


    @Query("SELECT s FROM Student s JOIN s.classroom c WHERE c.classroomId = :classroomId")
    Optional<List<Student>> findStudentsByClassroomId(@Param("classroomId") int classroomId);
}
