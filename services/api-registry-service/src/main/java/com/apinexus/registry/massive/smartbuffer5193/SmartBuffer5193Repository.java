package com.apinexus.registry.massive.smartbuffer5193;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartBuffer5193Repository extends JpaRepository<SmartBuffer5193, Long> {
    SmartBuffer5193 findByName(String name);
}
