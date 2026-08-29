package com.apinexus.registry.massive.smartcomponent9312;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartComponent9312Repository extends JpaRepository<SmartComponent9312, Long> {
    SmartComponent9312 findByName(String name);
}
