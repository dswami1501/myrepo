package org.swami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.swami.model.Attendance;
import org.swami.model.Classroom;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClassroomRepo extends JpaRepository<Classroom, Integer> {
    @Query("SELECT c FROM Classroom c JOIN c.students s WHERE s.studentId = :studentId")
    Optional<List<Classroom>> findClassroomByStudentId(int studentId);
}
