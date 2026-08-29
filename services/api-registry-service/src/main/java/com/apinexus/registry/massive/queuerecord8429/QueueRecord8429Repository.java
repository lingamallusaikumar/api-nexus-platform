package com.apinexus.registry.massive.queuerecord8429;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueRecord8429Repository extends JpaRepository<QueueRecord8429, Long> {
    QueueRecord8429 findByName(String name);
}
