package com.apinexus.registry.massive.neuralmap4058;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralMap4058Repository extends JpaRepository<NeuralMap4058, Long> {
    NeuralMap4058 findByName(String name);
}
