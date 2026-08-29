package com.apinexus.registry.massive.messagelist3187;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageList3187Repository extends JpaRepository<MessageList3187, Long> {
    MessageList3187 findByName(String name);
}
