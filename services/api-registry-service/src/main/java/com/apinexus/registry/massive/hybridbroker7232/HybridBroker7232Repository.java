package com.apinexus.registry.massive.hybridbroker7232;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridBroker7232Repository extends JpaRepository<HybridBroker7232, Long> {
    HybridBroker7232 findByName(String name);
}
