package com.apinexus.registry.massive.edgecache6309;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeCache6309Repository extends JpaRepository<EdgeCache6309, Long> {
    EdgeCache6309 findByName(String name);
}
