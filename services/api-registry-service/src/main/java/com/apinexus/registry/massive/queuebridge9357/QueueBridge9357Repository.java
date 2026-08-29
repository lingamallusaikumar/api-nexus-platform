package com.apinexus.registry.massive.queuebridge9357;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueBridge9357Repository extends JpaRepository<QueueBridge9357, Long> {
    QueueBridge9357 findByName(String name);
}
