package com.apinexus.registry.massive.neuralvertex7154;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralVertex7154Repository extends JpaRepository<NeuralVertex7154, Long> {
    NeuralVertex7154 findByName(String name);
}
