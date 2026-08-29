package com.apinexus.registry.massive.batchprocessor5274;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchProcessor5274Repository extends JpaRepository<BatchProcessor5274, Long> {
    BatchProcessor5274 findByName(String name);
}
