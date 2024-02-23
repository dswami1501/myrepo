package org.swami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swami.model.Exam;

@Repository
public interface ExamRepo extends JpaRepository<Exam, Integer> {
}
