package com.apinexus.registry.massive.batchworker919;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchWorker919Repository extends JpaRepository<BatchWorker919, Long> {
    BatchWorker919 findByName(String name);
}
