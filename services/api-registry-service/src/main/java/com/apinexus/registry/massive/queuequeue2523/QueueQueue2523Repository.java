package com.apinexus.registry.massive.queuequeue2523;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueQueue2523Repository extends JpaRepository<QueueQueue2523, Long> {
    QueueQueue2523 findByName(String name);
}
