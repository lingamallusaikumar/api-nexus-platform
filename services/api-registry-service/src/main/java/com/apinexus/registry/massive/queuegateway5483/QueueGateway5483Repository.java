package com.apinexus.registry.massive.queuegateway5483;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueGateway5483Repository extends JpaRepository<QueueGateway5483, Long> {
    QueueGateway5483 findByName(String name);
}
