package com.apinexus.registry.massive.queuecomponent1004;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueComponent1004Repository extends JpaRepository<QueueComponent1004, Long> {
    QueueComponent1004 findByName(String name);
}
