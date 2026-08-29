package com.apinexus.registry.massive.smartitem9418;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartItem9418Repository extends JpaRepository<SmartItem9418, Long> {
    SmartItem9418 findByName(String name);
}
