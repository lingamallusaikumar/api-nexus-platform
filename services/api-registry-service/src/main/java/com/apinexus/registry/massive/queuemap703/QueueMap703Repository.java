package com.apinexus.registry.massive.queuemap703;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueMap703Repository extends JpaRepository<QueueMap703, Long> {
    QueueMap703 findByName(String name);
}
