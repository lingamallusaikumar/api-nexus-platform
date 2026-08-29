package com.apinexus.registry.massive.neuralstack8868;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralStack8868Repository extends JpaRepository<NeuralStack8868, Long> {
    NeuralStack8868 findByName(String name);
}
