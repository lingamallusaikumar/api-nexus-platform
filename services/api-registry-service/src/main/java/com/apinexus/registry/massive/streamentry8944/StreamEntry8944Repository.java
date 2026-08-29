package com.apinexus.registry.massive.streamentry8944;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamEntry8944Repository extends JpaRepository<StreamEntry8944, Long> {
    StreamEntry8944 findByName(String name);
}
