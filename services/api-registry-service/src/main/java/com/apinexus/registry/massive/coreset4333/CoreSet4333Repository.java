package com.apinexus.registry.massive.coreset4333;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreSet4333Repository extends JpaRepository<CoreSet4333, Long> {
    CoreSet4333 findByName(String name);
}
