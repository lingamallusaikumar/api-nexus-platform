package com.apinexus.registry.massive.centrallog1230;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralLog1230Repository extends JpaRepository<CentralLog1230, Long> {
    CentralLog1230 findByName(String name);
}
