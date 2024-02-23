package com.onetomanyrelationship.restapionetomanyrelationship.repo;

import com.onetomanyrelationship.restapionetomanyrelationship.model.Classroom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClassroomRepo extends JpaRepository<Classroom, Integer> {

    Logger logger = LoggerFactory.getLogger(ClassroomRepo.class);

    @Query("SELECT c FROM Classroom c JOIN c.students s WHERE s.studentId = :studentId")
    Optional<Classroom> findClassroomByStudentId(int studentId);

}
