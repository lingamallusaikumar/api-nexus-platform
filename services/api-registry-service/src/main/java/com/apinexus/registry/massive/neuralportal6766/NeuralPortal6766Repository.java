package com.apinexus.registry.massive.neuralportal6766;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralPortal6766Repository extends JpaRepository<NeuralPortal6766, Long> {
    NeuralPortal6766 findByName(String name);
}
