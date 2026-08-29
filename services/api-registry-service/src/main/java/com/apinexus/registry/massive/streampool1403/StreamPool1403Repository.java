package com.apinexus.registry.massive.streampool1403;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamPool1403Repository extends JpaRepository<StreamPool1403, Long> {
    StreamPool1403 findByName(String name);
}
