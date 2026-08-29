package com.apinexus.registry.massive.streamvertex251;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamVertex251Repository extends JpaRepository<StreamVertex251, Long> {
    StreamVertex251 findByName(String name);
}
