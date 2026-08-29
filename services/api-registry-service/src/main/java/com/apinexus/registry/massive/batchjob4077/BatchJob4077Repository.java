package com.apinexus.registry.massive.batchjob4077;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchJob4077Repository extends JpaRepository<BatchJob4077, Long> {
    BatchJob4077 findByName(String name);
}
