package com.apinexus.registry.massive.queuedatabase1242;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueDatabase1242Repository extends JpaRepository<QueueDatabase1242, Long> {
    QueueDatabase1242 findByName(String name);
}
