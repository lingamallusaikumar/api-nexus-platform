package com.apinexus.registry.massive.networkroute5257;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkRoute5257Repository extends JpaRepository<NetworkRoute5257, Long> {
    NetworkRoute5257 findByName(String name);
}
