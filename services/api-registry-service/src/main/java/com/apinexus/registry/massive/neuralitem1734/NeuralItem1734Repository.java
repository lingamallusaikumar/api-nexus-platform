package com.apinexus.registry.massive.neuralitem1734;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralItem1734Repository extends JpaRepository<NeuralItem1734, Long> {
    NeuralItem1734 findByName(String name);
}
