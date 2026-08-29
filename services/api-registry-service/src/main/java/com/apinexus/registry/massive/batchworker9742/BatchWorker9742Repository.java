package com.apinexus.registry.massive.batchworker9742;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchWorker9742Repository extends JpaRepository<BatchWorker9742, Long> {
    BatchWorker9742 findByName(String name);
}
