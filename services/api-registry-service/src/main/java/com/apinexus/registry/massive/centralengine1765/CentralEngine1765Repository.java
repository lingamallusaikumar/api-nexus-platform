package com.apinexus.registry.massive.centralengine1765;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralEngine1765Repository extends JpaRepository<CentralEngine1765, Long> {
    CentralEngine1765 findByName(String name);
}
