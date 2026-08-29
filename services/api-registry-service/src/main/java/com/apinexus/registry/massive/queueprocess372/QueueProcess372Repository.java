package com.apinexus.registry.massive.queueprocess372;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueProcess372Repository extends JpaRepository<QueueProcess372, Long> {
    QueueProcess372 findByName(String name);
}
