package com.apinexus.registry.massive.smartbuffer136;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartBuffer136Repository extends JpaRepository<SmartBuffer136, Long> {
    SmartBuffer136 findByName(String name);
}
