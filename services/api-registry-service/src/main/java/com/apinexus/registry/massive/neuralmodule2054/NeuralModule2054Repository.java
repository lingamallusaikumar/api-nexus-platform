package com.apinexus.registry.massive.neuralmodule2054;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralModule2054Repository extends JpaRepository<NeuralModule2054, Long> {
    NeuralModule2054 findByName(String name);
}
