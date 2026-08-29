package com.apinexus.registry.massive.centralsystem3416;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralSystem3416Repository extends JpaRepository<CentralSystem3416, Long> {
    CentralSystem3416 findByName(String name);
}
