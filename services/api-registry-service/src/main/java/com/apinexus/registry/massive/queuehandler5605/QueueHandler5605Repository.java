package com.apinexus.registry.massive.queuehandler5605;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueHandler5605Repository extends JpaRepository<QueueHandler5605, Long> {
    QueueHandler5605 findByName(String name);
}
