package com.apinexus.registry.massive.neuralrepo1733;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralRepo1733Repository extends JpaRepository<NeuralRepo1733, Long> {
    NeuralRepo1733 findByName(String name);
}
