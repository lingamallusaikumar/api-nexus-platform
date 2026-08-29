package com.apinexus.registry.massive.neuralitem6957;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralItem6957Repository extends JpaRepository<NeuralItem6957, Long> {
    NeuralItem6957 findByName(String name);
}
