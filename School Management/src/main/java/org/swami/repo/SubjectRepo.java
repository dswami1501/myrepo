package org.swami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swami.model.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject,Integer> {
}
