package com.apinexus.registry.massive.batchjob8263;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchJob8263Repository extends JpaRepository<BatchJob8263, Long> {
    BatchJob8263 findByName(String name);
}
