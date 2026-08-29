package com.apinexus.registry.massive.neuralheap9308;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralHeap9308Repository extends JpaRepository<NeuralHeap9308, Long> {
    NeuralHeap9308 findByName(String name);
}
