package com.apinexus.registry.massive.queueservice2071;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueService2071Repository extends JpaRepository<QueueService2071, Long> {
    QueueService2071 findByName(String name);
}
