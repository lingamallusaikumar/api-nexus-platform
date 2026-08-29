package com.apinexus.registry.massive.centralstore5397;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralStore5397Repository extends JpaRepository<CentralStore5397, Long> {
    CentralStore5397 findByName(String name);
}
