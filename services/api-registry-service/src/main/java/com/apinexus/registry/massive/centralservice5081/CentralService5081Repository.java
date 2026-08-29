package com.apinexus.registry.massive.centralservice5081;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralService5081Repository extends JpaRepository<CentralService5081, Long> {
    CentralService5081 findByName(String name);
}
