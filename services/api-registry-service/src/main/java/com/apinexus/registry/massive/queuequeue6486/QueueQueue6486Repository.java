package com.apinexus.registry.massive.queuequeue6486;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueQueue6486Repository extends JpaRepository<QueueQueue6486, Long> {
    QueueQueue6486 findByName(String name);
}
