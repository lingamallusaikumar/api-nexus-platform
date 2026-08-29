package com.apinexus.registry.massive.messagetask9311;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageTask9311Repository extends JpaRepository<MessageTask9311, Long> {
    MessageTask9311 findByName(String name);
}
