package com.apinexus.registry.massive.messagesystem2094;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageSystem2094Repository extends JpaRepository<MessageSystem2094, Long> {
    MessageSystem2094 findByName(String name);
}
