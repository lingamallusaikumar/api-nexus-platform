package com.apinexus.registry.massive.queuebuffer6194;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueBuffer6194Repository extends JpaRepository<QueueBuffer6194, Long> {
    QueueBuffer6194 findByName(String name);
}
