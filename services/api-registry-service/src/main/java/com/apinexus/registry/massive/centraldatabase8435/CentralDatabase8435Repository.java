package com.apinexus.registry.massive.centraldatabase8435;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralDatabase8435Repository extends JpaRepository<CentralDatabase8435, Long> {
    CentralDatabase8435 findByName(String name);
}
