package com.apinexus.registry.massive.neuralmodule5045;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralModule5045Repository extends JpaRepository<NeuralModule5045, Long> {
    NeuralModule5045 findByName(String name);
}
