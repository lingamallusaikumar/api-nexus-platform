package com.apinexus.registry.massive.streamagent6666;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamAgent6666Repository extends JpaRepository<StreamAgent6666, Long> {
    StreamAgent6666 findByName(String name);
}
