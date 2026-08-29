package com.apinexus.registry.massive.centralvertex7034;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralVertex7034Repository extends JpaRepository<CentralVertex7034, Long> {
    CentralVertex7034 findByName(String name);
}
