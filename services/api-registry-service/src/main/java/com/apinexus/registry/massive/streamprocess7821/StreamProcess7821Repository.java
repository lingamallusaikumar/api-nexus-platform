package com.apinexus.registry.massive.streamprocess7821;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamProcess7821Repository extends JpaRepository<StreamProcess7821, Long> {
    StreamProcess7821 findByName(String name);
}
