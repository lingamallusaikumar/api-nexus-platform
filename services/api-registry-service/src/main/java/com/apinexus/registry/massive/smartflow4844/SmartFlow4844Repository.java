package com.apinexus.registry.massive.smartflow4844;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartFlow4844Repository extends JpaRepository<SmartFlow4844, Long> {
    SmartFlow4844 findByName(String name);
}
