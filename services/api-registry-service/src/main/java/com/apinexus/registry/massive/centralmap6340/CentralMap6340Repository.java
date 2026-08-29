package com.apinexus.registry.massive.centralmap6340;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralMap6340Repository extends JpaRepository<CentralMap6340, Long> {
    CentralMap6340 findByName(String name);
}
