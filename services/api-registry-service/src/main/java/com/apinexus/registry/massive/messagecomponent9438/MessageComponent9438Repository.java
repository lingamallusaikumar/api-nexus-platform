package com.apinexus.registry.massive.messagecomponent9438;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageComponent9438Repository extends JpaRepository<MessageComponent9438, Long> {
    MessageComponent9438 findByName(String name);
}
