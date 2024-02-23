package org.swami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swami.model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
