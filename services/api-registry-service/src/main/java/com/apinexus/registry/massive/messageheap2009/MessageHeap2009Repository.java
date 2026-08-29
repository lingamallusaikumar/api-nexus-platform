package com.apinexus.registry.massive.messageheap2009;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageHeap2009Repository extends JpaRepository<MessageHeap2009, Long> {
    MessageHeap2009 findByName(String name);
}
