package com.apinexus.registry.massive.queuestack7231;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueStack7231Repository extends JpaRepository<QueueStack7231, Long> {
    QueueStack7231 findByName(String name);
}
