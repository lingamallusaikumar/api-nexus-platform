package com.apinexus.registry.massive.neuralgateway6420;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeuralGateway6420Repository extends JpaRepository<NeuralGateway6420, Long> {
    NeuralGateway6420 findByName(String name);
}
