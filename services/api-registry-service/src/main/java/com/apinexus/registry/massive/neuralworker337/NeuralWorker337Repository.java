package com.apinexus.registry.massive.neuralworker337;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralWorker337Repository extends JpaRepository<NeuralWorker337, Long> {
    NeuralWorker337 findByName(String name);
}
