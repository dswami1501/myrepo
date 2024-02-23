package org.swami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swami.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
}
