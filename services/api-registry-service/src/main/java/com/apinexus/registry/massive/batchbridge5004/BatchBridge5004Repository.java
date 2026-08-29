package com.apinexus.registry.massive.batchbridge5004;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchBridge5004Repository extends JpaRepository<BatchBridge5004, Long> {
    BatchBridge5004 findByName(String name);
}
