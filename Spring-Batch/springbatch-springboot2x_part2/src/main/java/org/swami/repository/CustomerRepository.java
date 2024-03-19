package org.swami.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.swami.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
