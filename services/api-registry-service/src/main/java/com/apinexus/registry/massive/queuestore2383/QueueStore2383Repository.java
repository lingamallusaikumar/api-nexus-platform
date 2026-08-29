package com.apinexus.registry.massive.queuestore2383;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueStore2383Repository extends JpaRepository<QueueStore2383, Long> {
    QueueStore2383 findByName(String name);
}
