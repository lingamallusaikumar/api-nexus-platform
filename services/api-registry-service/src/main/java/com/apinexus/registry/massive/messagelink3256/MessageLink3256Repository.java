package com.apinexus.registry.massive.messagelink3256;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageLink3256Repository extends JpaRepository<MessageLink3256, Long> {
    MessageLink3256 findByName(String name);
}
