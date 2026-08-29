package com.apinexus.registry.massive.queuevertex2855;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueVertex2855Repository extends JpaRepository<QueueVertex2855, Long> {
    QueueVertex2855 findByName(String name);
}
