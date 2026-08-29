package com.apinexus.registry.massive.messagepool443;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagePool443Repository extends JpaRepository<MessagePool443, Long> {
    MessagePool443 findByName(String name);
}
