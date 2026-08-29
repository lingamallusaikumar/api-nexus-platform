package com.apinexus.registry.massive.queuerecord9500;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueRecord9500Repository extends JpaRepository<QueueRecord9500, Long> {
    QueueRecord9500 findByName(String name);
}
