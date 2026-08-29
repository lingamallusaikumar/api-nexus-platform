package com.apinexus.registry.massive.centralset5543;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralSet5543Repository extends JpaRepository<CentralSet5543, Long> {
    CentralSet5543 findByName(String name);
}
