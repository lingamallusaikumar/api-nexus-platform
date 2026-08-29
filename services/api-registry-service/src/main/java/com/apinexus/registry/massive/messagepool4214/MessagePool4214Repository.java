package com.apinexus.registry.massive.messagepool4214;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagePool4214Repository extends JpaRepository<MessagePool4214, Long> {
    MessagePool4214 findByName(String name);
}
