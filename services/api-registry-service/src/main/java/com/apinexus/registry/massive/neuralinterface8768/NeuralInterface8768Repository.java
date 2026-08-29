package com.apinexus.registry.massive.neuralinterface8768;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralInterface8768Repository extends JpaRepository<NeuralInterface8768, Long> {
    NeuralInterface8768 findByName(String name);
}
