package com.apinexus.registry.massive.messageprocessor1286;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageProcessor1286Repository extends JpaRepository<MessageProcessor1286, Long> {
    MessageProcessor1286 findByName(String name);
}
