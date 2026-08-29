package com.apinexus.registry.massive.batchagent1046;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchAgent1046Repository extends JpaRepository<BatchAgent1046, Long> {
    BatchAgent1046 findByName(String name);
}
