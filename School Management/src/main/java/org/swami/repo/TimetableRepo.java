package org.swami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swami.model.Timetable;

@Repository
public interface TimetableRepo extends JpaRepository<Timetable,Integer> {
}
