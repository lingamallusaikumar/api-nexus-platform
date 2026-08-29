package com.apinexus.registry.massive.queueprocessor1602;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueProcessor1602Repository extends JpaRepository<QueueProcessor1602, Long> {
    QueueProcessor1602 findByName(String name);
}
