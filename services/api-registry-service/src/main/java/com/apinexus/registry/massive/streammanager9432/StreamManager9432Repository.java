package com.apinexus.registry.massive.streammanager9432;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamManager9432Repository extends JpaRepository<StreamManager9432, Long> {
    StreamManager9432 findByName(String name);
}
