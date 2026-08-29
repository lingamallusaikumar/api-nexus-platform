package com.apinexus.registry.massive.centralpath8493;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralPath8493Repository extends JpaRepository<CentralPath8493, Long> {
    CentralPath8493 findByName(String name);
}
