package com.apinexus.registry.massive.dynamichandler2389;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicHandler2389Repository extends JpaRepository<DynamicHandler2389, Long> {
    DynamicHandler2389 findByName(String name);
}
