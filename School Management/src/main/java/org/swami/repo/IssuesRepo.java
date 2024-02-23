package org.swami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swami.model.Issues;

@Repository
public interface IssuesRepo extends JpaRepository<Issues, Integer> {
}
