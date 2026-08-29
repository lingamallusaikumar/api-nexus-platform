package com.apinexus.registry.massive.queuequeue2972;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueQueue2972Repository extends JpaRepository<QueueQueue2972, Long> {
    QueueQueue2972 findByName(String name);
}
