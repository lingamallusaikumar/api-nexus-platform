package com.apinexus.registry.massive.streampool7616;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamPool7616Repository extends JpaRepository<StreamPool7616, Long> {
    StreamPool7616 findByName(String name);
}
