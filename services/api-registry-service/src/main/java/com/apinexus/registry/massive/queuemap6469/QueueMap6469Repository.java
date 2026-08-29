package com.apinexus.registry.massive.queuemap6469;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueMap6469Repository extends JpaRepository<QueueMap6469, Long> {
    QueueMap6469 findByName(String name);
}
