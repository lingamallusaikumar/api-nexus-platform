package com.apinexus.registry.massive.centralmap6308;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralMap6308Repository extends JpaRepository<CentralMap6308, Long> {
    CentralMap6308 findByName(String name);
}
