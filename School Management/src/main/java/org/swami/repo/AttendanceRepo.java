package org.swami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swami.model.Attendance;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Integer> {
}
