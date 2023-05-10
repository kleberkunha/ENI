package com.ormaes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {

    Optional<Main.NewCustomerRequest> findById(Main.NewCustomerRequest request);
}
