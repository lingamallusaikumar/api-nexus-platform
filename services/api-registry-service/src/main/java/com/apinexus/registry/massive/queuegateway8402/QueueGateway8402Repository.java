package com.apinexus.registry.massive.queuegateway8402;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueGateway8402Repository extends JpaRepository<QueueGateway8402, Long> {
    QueueGateway8402 findByName(String name);
}
