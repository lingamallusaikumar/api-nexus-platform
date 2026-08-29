package com.apinexus.registry.massive.messageheap9118;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageHeap9118Repository extends JpaRepository<MessageHeap9118, Long> {
    MessageHeap9118 findByName(String name);
}
