package com.apinexus.registry.massive.streamvertex6576;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamVertex6576Repository extends JpaRepository<StreamVertex6576, Long> {
    StreamVertex6576 findByName(String name);
}
