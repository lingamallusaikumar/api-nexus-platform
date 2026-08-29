package com.apinexus.registry.massive.queueset2642;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueSet2642Repository extends JpaRepository<QueueSet2642, Long> {
    QueueSet2642 findByName(String name);
}
