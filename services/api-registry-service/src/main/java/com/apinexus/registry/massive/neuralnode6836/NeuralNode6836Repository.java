package com.apinexus.registry.massive.neuralnode6836;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralNode6836Repository extends JpaRepository<NeuralNode6836, Long> {
    NeuralNode6836 findByName(String name);
}
