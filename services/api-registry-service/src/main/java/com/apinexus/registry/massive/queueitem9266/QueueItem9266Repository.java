package com.apinexus.registry.massive.queueitem9266;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueItem9266Repository extends JpaRepository<QueueItem9266, Long> {
    QueueItem9266 findByName(String name);
}
